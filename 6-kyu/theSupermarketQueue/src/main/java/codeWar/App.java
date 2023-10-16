package codeWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueueCodeWar(new int[]{1, 6, 2, 6, 4, 2, 4, 4, 3, 5, 5, 6, 1}, 3));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
//        System.out.println(Arrays.toString(customers));
//        System.out.println(n);
        if (n == 1 || customers.length == 1) return Arrays.stream(customers).sum();
        if (n > customers.length) return Arrays.stream(customers).max().getAsInt();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> customerInTills = new ArrayList<>();

        for (int i : customers) {
            list.add(i);
        }

        //Index permettant de savoir le prochain client
        int indexPosNextCustomer = 0;
        // Mettre les premiers clients sur les caisses dispo
        for (int i = 0; i < n; i++) {
            customerInTills.add(list.get(i));
            // incrementer l'index qui permet de savoir qui est le prochain client
            indexPosNextCustomer++;
        }



        int time = 0;
        do {
            // Tri du tableau pour avoir du plus petit auplus grand
            Collections.sort(customerInTills);

            //Conserve la valeur minimum, c'est a dire la 1er caisse qui va finir
            int numMin = customerInTills.get(0);
            // On supprime cette valeur du tableau
            customerInTills.remove(0);
            //On rajoute le temps au resultat final
            time += numMin;

            // On va parcourir le tableau pour soustraire le temps min a l'ensemble des caisses ecnore en cours d'utilisation
            for (int i = 0; i < customerInTills.size(); i++) {
                // Sinon on soustrait le temps
                customerInTills.set(i, customerInTills.get(i) - numMin);
            }

            if (indexPosNextCustomer == list.size() && n >= customerInTills.size()) {
                time += Collections.max(customerInTills);
                break;
            }
            else {
                //On recupere le premier client en attente et on le rajoute à une caisse
                customerInTills.add(list.get(indexPosNextCustomer));
                //prochain client
                indexPosNextCustomer++;
            }

        } while (indexPosNextCustomer <= list.size());

        return time;
    }

    public static int solveSuperMarketQueueCodeWar(int[] customers, int n) {
        int[] result = new int[n];

            for (int i = 0; i < customers.length; i++) {
                result[0] += customers[i];
                Arrays.sort(result);
            }

            return result[n-1];
    }
}

