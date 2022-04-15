# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?


Cevap: 

Kotlin de, geç başlatılan değişkene lateinit değişken denir. lateiniti, değişkenin kullanılmadan önce başlatılacağından emin olduğumuzda kullanırız.

Değişkenin tipinin yanında “?” var ve bu, o değişkenin Nullable olduğunu belirtir. Ama biz o işareti koysak bile, null olarak tanımlamız gerekirse yani en başta değer atama işi olmadan kullanmak istersek ***lateinit*** kullanırız. Lateinit kullanmanın temel amacı, derleyiciye bu değişkenin geç başlatılacağını söylemektir.



```kotlin
package com.senaecelik.uitasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //Burada buttonu tanımladıktan sonra değer atama işlemini sonradan yapacağımızı söylüyoruz.
    //Aslında "bunun null olmadığını biliyorum, ama şu anda değer atamak istemiyorum.
    //Daha sonra değer ataması yapacağım, söz veriyorum" demektir.
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
        //Burada buttonuma değer ataması yapıldı.
        button = findViewById(R.id.button_start_now)
        
        button.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
```




### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

Cevap: 

Android Studio , tasarım zamanı özelliklerini veya derleme zamanı davranışlarını sağlayan tools namespaceler çeşitli XML öznitelikleri biçiminde çok daha zengin çeşitlilikte işlevler sağlar. Uygulama  oluşturulurken, tools namespaceleri bu özellikleri kaldırır, böylece çalışma zamanı davranışı veya APK
boyutu üzerinde hiçbir etkisi olmaz. 

Tools namespace ile gelen özellikleri kullanabilmek için her xml dosyasının root etiketine:

```kotlin
xmlns:tools="http://schemas.android.com/tools"
```

Tools özelliğini kullandığımızda bu yaptığımız değişiklik Android Stüdyo'da lokal olarak yapılmış olur ve uygulama APKsını etkilemez.

```kotlin
tools:background="@color/<some-color>"
```

