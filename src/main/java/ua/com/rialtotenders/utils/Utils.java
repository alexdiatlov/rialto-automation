package ua.com.rialtotenders.utils;

public class Utils {

    // create array and print how many elements in it
    public static void main(String[] args) {
        int[] agro_tech_cpv_arr = {16000000 - 5, 16100000 - 6, 16110000 - 9, 16120000 - 2, 16130000 - 5, 16140000 - 8, 16141000 - 5, 16150000 - 1, 16160000 - 4,
                16300000 - 8, 16310000 - 1, 16311000 - 8, 16311100 - 9, 16320000 - 4, 16330000 - 7, 16331000 - 4, 16340000 - 0, 16400000 - 9, 16500000 - 0,
                16510000 - 3, 16520000 - 6, 16530000 - 9, 16540000 - 2, 16600000 - 1, 16610000 - 4, 16611000 - 1, 16611100 - 2, 16611200 - 3, 16612000 - 8,
                16612100 - 9, 16612200 - 0, 16613000 - 5, 16620000 - 7, 16630000 - 0, 16640000 - 3, 16650000 - 6, 16651000 - 3, 16700000 - 2, 16710000 - 5,
                16720000 - 8, 16730000 - 1, 16800000 - 3, 16810000 - 6, 16820000 - 9, 34352300 - 2, 42214200 - 1, 51521000 - 0, 77111000 - 1, 77112000 - 8};
        int arrayLength = agro_tech_cpv_arr.length;
        System.out.println("Довжина масиву " + arrayLength + " елементів");

        for (int arr_element: agro_tech_cpv_arr){
            System.out.println(arr_element);
        }
    }

}

