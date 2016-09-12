package com.rajat;

import java.util.concurrent.ThreadLocalRandom;

public class RandomEpisode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int season = ThreadLocalRandom.current().nextInt(1, 11);
		
		int episode = ThreadLocalRandom.current().nextInt(1, 25);
		
		System.out.println("Friends S"+season+"E"+episode);

	}

}
