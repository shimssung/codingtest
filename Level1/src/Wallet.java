public class Wallet {
    public int[] higthlow(int[] size){
        int temp = 0;
        if(size[0] > size[1]){
            temp = size[0];
            size[0] = size[1];
            size[1] = temp;
        }
        return size;

    }

    public int solution(int[] wallet, int[] bill) {
        int[] newWallet;
        int[] newBill;
        int answer = 0;

        newWallet = higthlow(wallet);
        newBill = higthlow(bill);

        
        for(int i = 0; i < 1; i++){
            if(newBill[0] > newWallet[0] || newBill[1] > newWallet[1]){
                newBill[1] = newBill[1] / 2;
                answer += 1;
            }

            newBill = higthlow(bill);
            
            if(newBill[0] > newWallet[0] || newBill[1] > newWallet[1]){
                i--;
            }

        }

        return answer;
    }
}
