package util;

// 배열을 다룰 때 도움이 될 메소드들을 모아둔 클래스
public class ArrayUtil {

    public static void main(String[] args) {

    }

    // 1. int[]
    // 1-A. 현재 배열의 길이를 리턴하는 size()
    public static int size(int[] array) {
        return array.length;
    }

    // 1-B. 현재 배열이 아무것도 없으면 true, 있으면 false가 리턴 되는 isEmpty()
    public static boolean isEmpty(int[] array) {
        return size(array) == 0;
    }

    // 1-C. 현재 배열의 특정 인덱스의 값을 리턴하는 get()
    public static int get(int[] array, int index) {
        return array[index];
    }

    // 1-D. 현재 배열에서 특정 값의 가장 먼저 등장하는 인덱스를 찾는 index0f()
    // 단, 해당 배열에 그 값이 없으면 -1이 리턴된다.
    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < size(array); i++) {
            if (element == get(array, i)) {
                return i;                               //리턴 하면 break 인가??
            }
        }
        return -1;
    }

    // 1-E.현재 배열에서 특정 값의 가장 마지막에 등장하는 인덱스를 찾는 lastIndex0f()
    // 단, 해당 배열에 그 값이 없으면 -1이 리턴된다.
    public static int lastIndexOf(int[] array, int element) {
        for (int i = size(array) - 1; i >= 0; i--) {
            if (element == get(array, i)) {
                return i;
            }
        }
        return -1;
    }

    // 1-F. 현재 배열에서 특정한 값이 존재하면 true, 없으면 false가 나오는 contains()
    public static boolean contains(int[] array, int element) {
        return indexOf(array, element) != -1;
    }

    // 1-G. 현재 배열에 맨 마지막에 새로운 요소를 추가하는 add()
    public static int[] add(int[] array, int element) {
        // array보다 길이가 1이 더큰새로운 배열을 하나 만들어준다.
        int[] temp = new int[size(array) + 1];
        // 원본 배열인 array의 값들을 temp에 복사해온다.
        for (int i = 0; i < size(array); i++) {
            temp[i] = get(array, i);
        }
        // 새로운 요소인 element를 temp의 가장 마지막칸에 저장한다.
        temp[size(temp) - 1] = element;
        // temp를 리턴한다.
        return temp;
    }

    // 1-H. 현재 배열의 특정 인덱스에 새로운 값을 추가하는 add()
    public static int[] add(int[] array, int index, int element) {
        // 만약 index가 불가능한 index일 경우,
        // 원본 array를 다시 리턴한다.
        if (index < 0 || index > size(array)) {
            return array;
        }
        int[] temp = new int[0];
        for (int i = 0; i < size(array) + 1; i++) {
            if (i < index) {
                temp = add(temp, get(array, i));
            } else if (i == index) {
                temp = add(temp, element);
            } else {
                temp = add(temp, get(array, i - 1));
            }
        }
        return temp;
    }

    // 1-I. 해당 배열에서 특정 인덱스의 값을 다른 값으로 교체하고 원래 있던 값을 리턴하는 set()
    public static int set(int[] array, int index, int element) {
        if (index < 0 || index > size(array)) {
            return -1;
        }
        int temp = get(array, index);
        array[index] = element;
        return temp;
    }

    // 1-J. 해당 배열의 특정 인덱스를 삭제하는 remove()
    public static int[] remove(int[] array, int index) {
        int[] temp = new int[0];

        for (int i = 0; i < size(array); i++) {
            if (i != index) {
                temp = add(temp, get(array, i));
            }
        }
        return temp;
    }

    // 1-K. 해당 배열의 특정 엘리먼트를 삭제하는 removeElement()
    public static int[] removeElement(int[] array, int element) {
        return remove(array, indexOf(array, element));
    }

    // 정렬 코드
    public static int[] order(int[] array) {
        for (int i = 0; i < size(array) - 1; i++) {
            if (get(array, i) > get(array, i + 1)) {
                int temp = get(array, i);
                array[i] = get(array, i + 1);
                array[i + 1] = temp;
                i = -1;
            }
        }
        return array;
    }

    // 2. String[]
    // 2-A. 현재 배열의 길이를 리턴하는 size()
    public static int size(String[] array) {
        return array.length;
    }


    /*public static int size(String[] array) {
        return array.length;
    }*/
    // 2-B. 현재 배열이 아무것도 없으면 true, 있으면 false가 리턴 되는 isEmpty()
    public static boolean isEmpty(String[] array) {
        return size(array) == 0;
    }

    /*public static boolean isEmpty(String[] array) {
        return size(array) == 0;
    }*/
    // 2-C. 현재 배열의 특정 인덱스의 값을 리턴하는 get()
    public static String get(String[] array, int index) {
        return array[index];
    }

    /*public static String get(String[] array, int index) {
        return array[index];
    }*/

    // 2-D. 현재 배열에서 특정 값의 가장 먼저 등장하는 인덱스를 찾는 index0f()
    // 단, 해당 배열에 그 값이 없으면 -1이 리턴된다.
    public static int indexOf(String[] array, String element) {
        for (int i = 0; i < size(array); i++) {
            if (element.equals(get(array, i))) {
                return i;
            }
        }
        return -1;
    }
    /*public static int indexOf(String[] array, String element) {
        for (int i = 0; i < size(array); i++) {
            if (element.equals(get(array, i))) {
                return i;
            }
        }
        return -1;
    }*/

    // 2-E.현재 배열에서 특정 값의 가장 마지막에 등장하는 인덱스를 찾는 lastIndex0f()
    // 단, 해당 배열에 그 값이 없으면 -1이 리턴된다.
    public static int lastIndexOf(String[] array, String element) {
        for (int i = size(array) - 1; i >= 0; i--) {
            if (element.equals(get(array, i))) {
                return i;
            }
        }
        return -1;
    }

    /*public static int lastIndexOf(String[] array, String element) {
        for (int i = size(array) - 1; i >= 0; i--) {
            if (element.equals(get(array, i))) {
                return i;
            }
        }
        return -1;
    }*/

    // 2-F. 현재 배열에서 특정한 값이 존재하면 true, 없으면 false가 나오는 contains()
    public static boolean contains(String[] array, String element) {
        return (indexOf(array, element)) != -1;
    }


    /*public static boolean contains(String[] array, String element) {
        return (indexOf(array, element) != -1);
    }*/

    // 2-G. 현재 배열에 맨 마지막에 새로운 요소를 추가하는 add()
    public static String[] add(String[] array, String element) {
        String[] temp = new String[size(array) + 1];
        for (int i = 0; i < size(array); i++) {
            temp[i] = get(array, i);
        }
        temp[size(temp) - 1] = element;
        return temp;
    }

    /*public static String[] add(String[] array, String element) {
        String[] temp = new String[size(array) + 1];
        for (int i = 0; i < size(array); i++) {
            temp[i] = get(array, i);
        }
        temp[size(temp) - 1] = element;         --> size(temp)-1 = size(array)
        return temp;
    }*/

    // 2-H. 현재 배열의 특정 인덱스에 새로운 값을 추가하는 add()
    public static String[] add(String[] array, int index, String element) {
        if (index < 0 || index > size(array)) {
            return array;
        }
        String[] temp = new String[0];
        for (int i = 0; i < size(array)+1; i++) {
            if (i < index) {
                temp = add(temp, get(array, i));
            } else if (i == index) {
                temp = add(temp, element);
            } else {
                temp = add(temp, get(array, i - 1));
            }
        }
        return temp;
    }

    /*public static String[] add(String[] array, int index, String element) {
        if (index < 0 || index > size(array)) {
            return array;
        }
        String[] temp = new String[size(array) + 1];
        for (int i = 0; i < size(array); i++) {
            if (i < index) {
                temp[i] = get(array, i);
            } else if (i == index) {
                temp[i] = element;
            } else {
                temp[i] = get(array, i - 1);
            }
        }
        return temp;
    }*/

    // 2-I. 해당 배열에서 특정 인덱스의 값을 다른 값으로 교체하고 원래 있던 값을 리턴하는 set()
    public static String set(String[] array,int index, String element) {
        String temp = get(array,index);
        array[index]=element;
        return temp;

    }

    /*public static String set(String[] array, int index, String element) {
        if (index < 0 || index > size(array)) {
            return "null";
        }
        String temp = array[index];
        array[index] = element;
        return temp;

    }*/

    // 2-J. 해당 배열의 특정 인덱스를 삭제하는 remove()
    public static String[] remove(String[] array,int index) {
        String[] temp = new String[0];
        for (int i=0; i<size(array);i++) {
            if (i != index) {
                temp = add(temp,get(array,i));
            }
        }
        return temp;
    }

    /*public static String[] remove(String[] array, int index) {
        String[] temp = new String[0];
        for (int i = 0; i < size(array); i++) {
            if (i != index) {
                temp = add(temp, get(array, i));
            }
        }
        return temp;
    }*/

    // 1-K. 해당 배열의 특정 엘리먼트를 삭제하는 removeElement()
    public static String[] remove(String[] array,String element) {
        return remove(array,indexOf(array,element));
    }
   /* public static String[] removeElement(String[] array, String element) {
        return remove(array, indexOf(array, element));

    }*/


}
