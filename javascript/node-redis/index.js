const redis = require("redis");
const client = redis.createClient();

client.set("foo", "bar");

