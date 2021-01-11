package yolo;

import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] agrs) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
    }
}