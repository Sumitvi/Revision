const { exec } = require("child_process");
const fs = require("fs");

console.log("🔁 Auto commit started... (every 3 seconds)");

setInterval(() => {
  // Step 1: Check if there are any changes
  exec("git status --porcelain", (err, stdout) => {
    if (err) {
      console.error("❌ Git status error:", err);
      return;
    }

    if (stdout.trim().length === 0) {
      // No change in file content
      console.log("🟡 No changes to commit");
      return;
    }

    // Step 2: Stage all changes
    exec("git add .", (err) => {
      if (err) {
        console.error("❌ Git add error:", err);
        return;
      }

      // Step 3: Commit with current timestamp
      const message = `Auto commit: ${new Date().toLocaleString("en-IN", {
        timeZone: "Asia/Kolkata",
      })}`;

      exec(`git commit -m "${message}"`, (err) => {
        if (err) {
          console.error("❌ Commit Error:", err.message);
          return;
        }

        // Step 4: Push to remote branch (change 'main' to your branch)
        exec("git push origin main", (err) => {
          if (err) {
            console.error("❌ Push Error:", err.message);
          } else {
            console.log(`✅ Pushed: ${message}`);
          }
        });
      });
    });
  });
}, 3000);
