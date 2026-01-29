import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<Integer>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String g = genres[i];

            genreTotal.put(g, genreTotal.getOrDefault(g, 0) + plays[i]);

            if (!genreSongs.containsKey(g)) {
                genreSongs.put(g, new ArrayList<>());
            }
            genreSongs.get(g).add(i);
        }

        // 장르를 총 재생 수 내림차순으로 정렬
        List<String> orderedGenres = new ArrayList<>(genreTotal.keySet());
        orderedGenres.sort((a, b) -> Integer.compare(genreTotal.get(b), genreTotal.get(a)));

        List<Integer> result = new ArrayList<>();

        for (String g : orderedGenres) {
            List<Integer> songIds = genreSongs.get(g);

            // 장르 내 곡 정렬: 재생수 내림차순, 같으면 id 오름차순
            songIds.sort((i1, i2) -> {
                int cmp = Integer.compare(plays[i2], plays[i1]);
                if (cmp != 0) return cmp;
                return Integer.compare(i1, i2);
            });

            result.add(songIds.get(0));
            if (songIds.size() > 1) result.add(songIds.get(1));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
