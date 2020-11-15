# MTIT-MobileApplicationDevelopment
### Joke Mobile Application Using API

![WhatsApp Image 2020-11-14 at 23 28 09](https://user-images.githubusercontent.com/48553417/99179788-cdddef00-2746-11eb-81dc-0f8dfa2ec671.jpeg)

#### When you open the application you can see the above screenshot. And after 3s it will auto redirect to the login page. Because I will hope to use AdMob in the welcome page.

![WhatsApp Image 2020-11-14 at 23 29 12](https://user-images.githubusercontent.com/48553417/99179785-ca4a6800-2746-11eb-82a5-2f3293e1eb4a.jpeg)
![WhatsApp Image 2020-11-14 at 23 27 57](https://user-images.githubusercontent.com/48553417/99179787-ccacc200-2746-11eb-88d3-7dcc5e1bd4d7.jpeg)

# Author Account
https://github.com/15Dkatz/official_joke_api

# Official Joke API

## Endpoints:

### Grab a random joke!
[https://official-joke-api.appspot.com/random_joke](https://official-joke-api.appspot.com/random_joke)


[https://official-joke-api.appspot.com/jokes/random](https://official-joke-api.appspot.com/jokes/random)

### Grab ten random jokes!
[https://official-joke-api.appspot.com/random_ten](https://official-joke-api.appspot.com/random_ten)



[https://official-joke-api.appspot.com/jokes/ten](https://official-joke-api.appspot.com/jokes/ten)

### Grab jokes by type!

The endpoints are `jokes/:type/random` or `jokes/:type/ten`. For example:

[https://official-joke-api.appspot.com/jokes/programming/random](https://official-joke-api.appspot.com/jokes/programming/random)

[https://official-joke-api.appspot.com/jokes/programming/ten](https://official-joke-api.appspot.com/jokes/programming/ten)

***

## How these jokes were collected

The majority of these jokes were contributed by joke-loving coders around the world!

### Make a contribution!

Submit a Pull Request, with your joke added to the jokes/index.json file. Make sure the joke is in this format:

```javascript
{
  "id": last joke id + 1,
  "type": "programming",
  "setup": "What's the best thing about a Boolean?",
  "punchline": "Even if you're wrong, you're only off by a bit."
}
```

***

### Run Locally
* Clone the repo
* `npm i && npm run dev`
* Visit `localhost:3005/jokes/random` or `localhost:3005/jokes/ten` on your browser!
