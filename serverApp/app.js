
const express = require('express');
const app = express();
const PORT = 8080;

app.get('/', (req, res) => {
  res.send('Voting Bulgaria');
});

app.get('/api/elections', (req, res) => {
  res.send([1,2,3]);
});

app.listen(PORT, () => console.log(`Listening on port ${PORT}`));