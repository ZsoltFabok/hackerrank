
public class AcmIcpcTeam {
    static int[] acmTeam(String[] topic) {
        int max = 0;
        int teams = 0;

        int i = 0;
        while (i < topic.length) {
            int j = i + 1;
            while (j < topic.length) {
                int knownAreas = 0;
                for (int s = 0; s < topic[i].length(); s++) {
                    if (topic[i].charAt(s) == '1' || topic[j].charAt(s) == '1') {
                        knownAreas++;
                    }
                }

                if (knownAreas > max) {
                    max = knownAreas;
                    teams = 1;
                } else if (knownAreas == max) {
                    teams++;
                }

                j++;
            }
            i++;
        }

        return new int[]{max, teams};
    }
}
