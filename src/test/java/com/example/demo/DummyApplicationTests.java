package com.example.demo;

import com.example.demo.Service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DummyApplicationTests {

	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	public void addUse(String name,String surname){
	}

	@Test
	public void removeUser(long Id){

	}

	@Test
	public void getUser(long Id){

	}


	@Test
	void addUser() {
//		String username = userServiceImpl.addUser(1001,"Kingdom","Kings");
//		//	assertThat(username).isLocalTo("");
	}

	@Test
	void cacheTest()
	{

//		userServiceImpl.getUser(1);
//		String cache = userServiceImpl.cacheUser("Hello");
//		String cache2 = userServiceImpl.cacheUser("Hello1");
//		String cache3 = userServiceImpl.cacheUser("Hello2");
//		String cache4 = userServiceImpl.cacheUser("Hello3");

//		System.out.println(userServiceImpl);
	}
}
