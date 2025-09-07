package order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;





@SpringBootApplication
@EnableCaching

//@Bean
//CacheManager cacheManager() {
//    // configure and return an implementation of Spring's CacheManager SPI
//    SimpleCacheManager cacheManager = new SimpleCacheManager();
//    cacheManager.setCaches(Set.of(new ConcurrentMapCache("default")));
//    return cacheManager;
//}
//}

public class OrderApplication {

	public static void main(String[] args) {
		
		MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
		MemoryUsage nonHeapUsage = memoryBean.getNonHeapMemoryUsage();

		System.out.println("Heap Memory Used: " + heapUsage.getUsed());
		System.out.println("Heap Memory Max: " + heapUsage.getMax());
		System.out.println("Non-Heap Memory Used: " + nonHeapUsage.getUsed());
		
		
		SpringApplication.run(OrderApplication.class, args);
	}

}
