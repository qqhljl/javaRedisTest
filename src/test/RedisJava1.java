package test;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisJava1 {

	//连接本地redis 服务
	public static void main(String[] args) {
	      //连接本地Redis 服务
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      //查看服务是否运行
	      System.out.println("Server is running: "+jedis.ping());
	 }
	
	//Redis Java String(字符) 实例
/*	public static void main(String[] args) {
	      //连接本地Redis 服务
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      //设置 redis 字符串数�?
	      jedis.set("runoobkey", "Redis tutorial");
	     // 获取存储的数据并输出
	     System.out.println("Stored string in redis:: "+ jedis.get("runoobkey"));
	 }*/
	
	//Redis Java List(列表) 实例
/*	public static void main(String[] args) {
	      //连接本地 Redis 服务
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      //存储数据到列表中
	      jedis.lpush("tutorial-list", "Redis");
	      jedis.lpush("tutorial-list", "Mongodb");
	      jedis.lpush("tutorial-list", "Mysql");
	     // 获取存储的数据并输出
	     List<String> list = jedis.lrange("tutorial-list", 0 ,5);
	     for(int i=0; i<list.size(); i++) {
	       System.out.println("Stored string in redis:: "+list.get(i));
	     }
	 }*/
	
	
	//Redis Java Keys 实例
	/* public static void main(String[] args) {
	      //连接本地 Redis 服务
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      
	     // 获取数据并输
	     List<String> list = jedis.keys("*");
	     for(int i=0; i<list.size(); i++) {
	       System.out.println("List of stored keys:: "+list.get(i));
	     }
	   }*/
}
