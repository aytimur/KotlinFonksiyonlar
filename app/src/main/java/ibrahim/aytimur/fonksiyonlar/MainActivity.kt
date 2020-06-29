package ibrahim.aytimur.fonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Kullanıcı tanımlı fonksiyonlar
        //textView.setText(merhaba())
        //textView.setText(carpim().toString())
        //textView.setText(topla(2,3).toString())
       // textView.setText(bilgiler("sinan","ürün"))
        mesaj()
    }
    //Kullanıcı tanımlı fonksiyonlar
    // Paramtere almayan ve dönüş tipi String olan  fonksiyon
    fun merhaba():String{
        return "Merhaba Turkiye"
    }
    fun merhaba2():String = "Merhaba Turkiye"
    // Paramtere almayan ve dönüş tipi Int olan  fonksiyon
    fun carpim():Int{
        var x = 2
        var y = 3
        return x*y
    }
    // Parametre alan ve dönüş tipi Int olan fonksiyon
    fun topla(sayi1:Int,sayi2: Int):Int{
        return sayi1 + sayi2
    }
    // Parametre alan ve dönüş tipi String olan fonksiyon
    fun bilgiler(adi:String="İbrahim",soyadi:String="Aytimur",unavni:String="öğretmen"):String{
        return adi + soyadi + unavni
    }
    // Parametre alan ve dönüş yapmayan fonksiyon
    fun mesaj(pdili:String="Kotlin", konu:String="Fonksiyonlar"){
        textView.setText(pdili+konu)
    }
}