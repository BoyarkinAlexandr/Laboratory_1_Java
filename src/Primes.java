public class Primes {
    public static void main(String[] args) {
        //Вывод простых чисел на экран консоли
        for (int i = 2;i<=100;i++)
        {
            if (isPrime(i)==true)
            {
                System.out.print(i + " ");
            }
        }

    }

    //Функция, которая определяет простое ли число
    public static boolean isPrime(int n) {
        for (int i = 2; i<n; i++)
        {
           if ((n % i) == 0){
               return false;

        }
        }
        return true;
    }
}