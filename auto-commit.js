const { exec } = require("child_process");

console.log("🔁 Auto commit started... (every 3 seconds)");

setInterval(() => {
  // Step 1: Check if anything changed
  exec("git status --porcelain", (err, stdout, stderr) => {
    if (err) {
      console.error("❌ Git status error:", stderr);
      return;
    }

    if (stdout.trim().length === 0) {
      // No changes
      console.log("⏳ No changes detected.");
      return;
    }

    // Step 2: Add all changes
    exec("git add .", (err) => {
      if (err) {
        console.error("❌ Add Error:", err);
        return;
      }

      // Step 3: Commit with timestamp
      const message = `Auto commit: ${new Date().toLocaleString("en-IN")}`;
      exec(`git commit -m "${message}"`, (err) => {
        if (err) {
          console.error("❌ Commit Error:", err.message);
          return;
        }

        // Step 4: Push to master branch
        exec("git push origin master", (err) => {
          if (err) {
            console.error("❌ Push Error:", err.message);
            return;
          }
          console.log(`✅ Pushed: ${message}`);
        });
      });
    });
  });
}, 3000);
