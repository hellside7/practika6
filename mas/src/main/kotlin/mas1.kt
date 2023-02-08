import kotlin. random. Random
fun main (){
    val rr = Random.nextInt(150,200)
    val mas: Array<Array<Double>> = Array(2) { Array(20) { Random.nextDouble(150.0, 200.0) } }
    var k =0
    var sr: Double =1.0;
    for(row in mas)
    {
         sr =0.0
         k=0
        for (cell in row)
        {
            k++
            print("$cell \t")
            sr+= cell
            if(k==20) sr= sr/20
        }
        println("средний рост = $sr")
    }

}