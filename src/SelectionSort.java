/**
 * Created by ihanbin on 2017. 3. 8..
 * 선택 정렬 알고리즘
 * 다듬어야 할 필요가있는듯.. 다른코드들과 비교해봤을때 (2017.03.08)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10 , 3 , 5 , 7 , 9 , 11 , 2};

        System.out.print("[");
        for(int element : SelectionSort.maxSort(array)) {
            System.out.print(element + " ");
        }
        System.out.print("]");
    }

    // 최대값 선택 정렬
    public static int[] maxSort(int[] array) {
        int count = 0;
        int maxValue = array[0]; // 기준값을 0번째 원소로 잡는다.

        int[] resultArray = new int[array.length]; // 정렬한 결과를 담을 배열을 하나 만든다.

        while(array.length-1 > count) {
            // 파라미터로 받은 배열만큼 반복문을 돈다.
            for (int i = count; i < array.length; i++) {
                // 최대값을 찾는다.
                // 찾은 후 0번째 부터 최대값과 기존 배열의 값을 바꿔준다.
                if (maxValue < array[i]) {
                    int temp = maxValue;
                    maxValue = array[i];
                    array[count] = maxValue;
                    array[i] = temp;
                }
            }

            // 0번째 부터 최대값을 채워넣는다.
            resultArray[count] = maxValue;
            count++;
            maxValue = array[count];
        }

        // 맨마지막에는 비교를 못하므로 기존배열 맨 마지막값(정렬이 끝난뒤 가장 작은값)을 넣어준다.
        resultArray[array.length-1] = array[array.length-1];

        return resultArray;
    }
}
