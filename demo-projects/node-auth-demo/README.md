# AuthDemo Application
>
> Showcases proof of work of authentication using PassportJS.

## How to run on localhost?

Great Question! Follow these steps :

* Git clone this repository
* Open this directory
* Make sure you have MongoDB installed and configured correctly
* Open up a terminal, and type ->

```powershell
npm install
node app.js
```

* Go to `localhost:5000` in your browser and have fun!

## Built with >

* Node.js : [Download](https://nodejs.org/en/download/)
* MongoDb : [Download](https://www.mongodb.com/try/download/community)

## Resources to further learn from >

* [Randall Degges - Everything You Ever Wanted to Know About Web Authentication in Node](https://youtu.be/i7of02icPyQ) (🚨 He swears a lot! But its a great resource)
* [PassportJS Authentication Docs](http://www.passportjs.org/docs/authenticate/)
* [A good StackOverflow thread that explains HASH and SALT](https://stackoverflow.com/questions/17201450/salt-and-hash-password-in-nodejs-w-crypto)

**The password is NOT stored in the database. Never store plaintext passwords in the database!**

An example of a sample user generated in the database from this application is as followed. Notice that password isn't stored, but instead a hash and its salt (to decrypt it) is stored:

```json
{
  "_id": "5efcff7f9f209b171c1f890d",
  "username": "RETR0_SC0PE",
  "salt": "39a379ba87b46234dd795b00a6fb3e99289ac27dcc41b700bf231c76ebffb7ab",
  "hash": "26b65f295395d9c7c62906aab4c1c2a73d04fd0b453d2c123135a5716b51748b9f5a38aafae3dd5ac81eeb881c2095f5c96d3a665113d22c1c425abbcc61303fcd141e436f537f1fb31d5544e6940e3f205172b3f855f58e994125284c605d027306146fc40eaada299f85979fc6be3031a30e8e962009a23cdd61132268d2ce71d6db081f9fa0d560329271eefb81289e19d5a2ffb40a338b0ef8e59dc4ad53309bcb2035858de15d7f564aa676e26383aad18f07905636c096abaa17771ece203a26f5c7e058f29dd92ffd482072c13a471053ec43eac5daaac11aedd368680ad062bcd81ec83c2ecbdc41d50eb9e7ba26965affbe905427cbf5a1d3ab87d38fd8309495e059dd4a06967c8c2a853daba69f1af185a2cf301d69604055cf83fb89ec58aef1b688379f4d697ee678bdcf77960d9a2a036af105fe1f1e12df3ca9906e4dfad26a1e1042079f95049163bd21a81068e1e205e6d4c71d06c7349fae6b191668de95bd60f8e882a71a2515b2d7148c7228a9b0340c0029d7eb186a4a31f2d93166491b1d263339a97c45992ac1e78e7e0c99f28450dc2249e159bff758e94fa4ef5f409827f32989c7fbad748eccc7d0b79e5d8ffcb58e68192364187e8d7811137fac805486e7a65f546250f69e4e02484788b1bdf3c0aceae9276142fe3ccb8bc15430e1d3d00f3f7cd50f10d4ee9cb345a97b23e7d796e6a46c",
  "__v": 0
}

```
