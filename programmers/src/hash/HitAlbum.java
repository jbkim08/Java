package hash;

import java.util.HashMap;

public class HitAlbum {

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic","classic","pop"};
		int[] plays = { 500, 600, 150, 800, 2500 };

		System.out.println(solution(genres, plays));

	}
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> genreMap = new HashMap<>(); 
        HashMap<String, Integer> newAlbum = new HashMap<>(); 
        for(int i=0; i < genres.length; i++) {
        	genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        for(String gen : genreMap.keySet()) {
        	int[] bestSongIndexes = new int[2];

        	for(String s : genres) {
        		if(gen == s);
        	}
        		
        }
        
        return answer;
    }
}
