const { exec } = require('child_process');
const path = require('path');

console.log("🔁 Auto commit started... (every 3 seconds)");

setInterval(() => {
  exec('git add .', (err) => {
    if (err) return console.log('❌ Add Error:', err);

    const commitMessage = `Auto commit: ${new Date().toLocaleString()}`;
    exec(`git commit -m "${commitMessage}"`, (err) => {
      if (err) return console.log('❌ Commit Error:', err.message.trim());

      exec('git push origin main', (err) => {
        if (err) return console.log('⚠️ Push Error:', err.message.trim());
        console.log('✅ Pushed:', commitMessage);
      });
    });
  });
}, 3000);
