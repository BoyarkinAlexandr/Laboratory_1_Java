public class Primes {
    public static void main(String[] args) {
        //Вывод простых чисел
        for (int i = 2;i<=100;i++)  //Перебирание чисел от 0 до 100
        {
            if (isPrime(i)==true)
            {
                System.out.print(i + " ");
            }
        }

    }

    //Функция isPrime, которая определяет, яв-ся ли аргумент простым числом или нет
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