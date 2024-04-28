import org.w3c.dom.ranges.Range

fun main(){
    val hygiene = Product("Detol",90.0,2,"Hygiene")
    val groceries = Product("Tomato",90.0,1,"Groceries")
    val appliances = Product("Kettle",90.0,1,"Appliances")

    println(groceries.price)
    println(hygiene.price)
    println(appliances.price)
    println(appliances.price + hygiene.price + groceries.price)

    val myProducts = listOf(hygiene,appliances,groceries)
    println(myProducts)

//    println(myProducts.sortedByDescending { product -> product.price })

//    println(total(listOf(hygiene,groceries,appliances)))



    myStr("Barnie bakes brown bagels and buns")
    myNums(1..1000)






}

data class Product(
    var category: String,
    var price: Double,
    var quantity: Int,
    var group: String


)

//fun total(myProducts: List<Product>){
//    val totals =myProducts.sortedBy{ product -> product.group }
//    println(totals)
//
//    for (i in myProducts){
//
//
//
//        }
//
//    }
//
//
//
//
//}
//REMOVING EVERY OCCURRENCE OF B
fun myStr(name: String){
    var name2 = name.toLowerCase()
    println(name2)
    var name3 = name2.filterNot { it == 'b'}
    println(name3)

}

//Write a function that prints out the multiples of 8 and 6 between 1 and 1000. For multiples
//of both 8 and 6 it should print out bingo

fun myNums(multiples: IntRange){
    for (i in multiples){
        if (i%8==0 && i%6==0){
            println("bingo")

        }else if (i%8==0){
            println(i)
        }else if (i%6==0){
            println(i)

        }
        else
            i%8!==0 && i%6!==0
                continue
    }
}




