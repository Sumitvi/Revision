const { exec } = require("child_process");

console.log("🔁 Auto commit started... (every 3 seconds)");

setInterval(() => {
  // First check if there are changes
  exec("git status --porcelain", (err, stdout, stderr) => {
    if (stdout.trim().length === 0) {
      // No changes to commit
      return;
    }

    // Add, Commit, and Push
    exec("git add .", () => {
      const timestamp = new Date().toLocaleString();
      exec(`git commit -m "Auto commit: ${timestamp}"`, (err, stdout, stderr) => {
        if (err) {
          console.error("❌ Commit Error:", stderr || err.message);
        } else {
          exec("git push origin main", (err, stdout, stderr) => {
            if (err) {
              console.error("❌ Push Error:", stderr || err.message);
            } else {
              console.log(`✅ Pushed: Auto commit: ${timestamp}`);
            }
          });
        }
      });
    });
  });
}, 3000); // 3 seconds
