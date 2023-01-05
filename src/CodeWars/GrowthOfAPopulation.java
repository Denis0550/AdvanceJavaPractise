package CodeWars;

public class GrowthOfAPopulation {

    /*
    In a small town the population is p0 = 1000 at the beginning of a year.
    The population regularly increases by 2 percent per year and moreover 50 new
    inhabitants per year come to live in the town. How many years does the town
    need to see its population greater or equal to p = 1200 inhabitants?
    */


//    At the end of the first year there will be:
//            1000 + 1000 * 0.02 + 50 => 1070 inhabitants
//
//    At the end of the 2nd year there will be:
//            1070 + 1070 * 0.02 + 50 => 1141 inhabitants (** number of inhabitants is an integer **)
//
//    At the end of the 3rd year there will be:
//            1141 + 1141 * 0.02 + 50 => 1213



    public static void main(String[] args) {
       int x =  nbYear(1000,2,50, 1200);
        System.out.println(x);
    }
    public static int nbYear(int p0, double percent, int aug, int p) {
        percent = percent / 100;
        int count = 0;
        while (p0 < p) {
            p0 = (int) (p0 + p0 * percent + aug);
            count++;
        }
        return count;

    }
}
