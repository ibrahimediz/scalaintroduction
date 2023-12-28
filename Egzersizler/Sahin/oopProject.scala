class Customer(
    val fullName:String, 
    val idNumber:Int, 
    val accounts:ArrayBuffer[String]
    ){

    }

class Account(
    val accountNumber:Int,
    val balance:Double, 
    val accountType:String
    ):
    override def toString(): String = s"Hesap No: $accountNumber, Tür: $accountType Bakiye:$balace"
    def deposit(amount: Double):Unit=
        balance += amount
    
    def withdraw(amount:Double ):Unit = 
        if (amount <= balance) then
            balance -= amount
        else
            println("Yetersiz Bakiye")

class Bank(
    val customers:ArrayBuffer[String]
    ){

    }

@main def run()={
}