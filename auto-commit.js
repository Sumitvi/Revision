// auto-commit.js
const { exec } = require('child_process');

console.log("🔁 Auto commit started... (every 3 seconds)");

setInterval(() => {
  // Step 1: git add .
  exec('git add .', (addErr, addOut, addErrMsg) => {
    if (addErr) {
      console.error('❌ Git Add Error:', addErrMsg);
      return;
    }

    // Step 2: git commit -m "Auto commit at <time>"
    const msg = `Auto commit at ${new Date().toLocaleTimeString()}`;
    exec(`git commit -m "${msg}"`, (commitErr, commitOut, commitErrMsg) => {
      if (commitErr) {
        if (commitErrMsg.includes("nothing to commit")) {
          console.log('📭 Nothing to commit...');
        } else {
          console.error('❌ Commit Error:', commitErrMsg);
        }
        return;
      }

      console.log(`✅ Committed: "${msg}"`);

      // Step 3 (Optional): git push origin main
      exec('git push origin main', (pushErr, pushOut, pushErrMsg) => {
        if (pushErr) {
          console.error('⚠️ Push failed:', pushErrMsg.trim());
        } else {
          console.log('🚀 Changes pushed to GitHub');
        }
      });
    });
  });
}, 3000); // Every 3 seconds
