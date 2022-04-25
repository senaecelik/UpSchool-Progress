# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)


## <a name="1"></a> Araştırma Projesi 1

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


## <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır?
- Nasıl kullanılmalıdır?
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
## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

P.S. [Bu linkten](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml ) faydalanarak font family projenizde deneyebilirsiniz.

**Cevap:**

res klasörüne sağ tıklayın ve **new > android resource** directory tıklayın. font seçerek bir ***font*** dizini oluşturulur. İnternet üzerinde font kaynakları indirerek, bu fontları font resource içine ekliyoruz. 

### Nasıl oluşturulur?

<img align="center" src="https://user-images.githubusercontent.com/48855691/163952320-cb57f674-72ba-4a1c-b4c8-e7928eae239c.gif">

### Nasıl kullanılır?
```kotlin
<?xml version="1.0" encoding="utf-8"?>
<font-family xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <font
        app:fontStyle="normal"
        app:fontWeight="400"
        app:font="@font/lobstertwo_regular"
        />
  
    <font
        app:fontStyle="italic"
        app:fontWeight="400"
        app:font="@font/lobstertwo_italic"
        />

</font-family>
```



<img align="right" width="400" height="800" src="https://user-images.githubusercontent.com/48855691/163959897-bc452eef-0a86-4f59-a5d9-0f13856834d9.png">

### activity_main.xml

```kotlin
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView1"
        style="@style/Title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="200dp"
        android:text="@string/title"

        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />


    <TextView
        android:id="@+id/textView2"
        style="@style/subTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/subTitle"
        android:layout_marginTop="32dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView1" />

 

    <TextView
        android:id="@+id/textView3"
        style="@style/subTitle1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/subTitle1"
        android:layout_marginTop="32dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
### style.xml Dosyası


```kotlin
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="Title">
        <item name="android:fontFamily">@font/fonts</item>
        <item name="android:textStyle">bold</item>
        <item name="android:textSize">32sp</item>
        <item name="android:textColor">@color/purple_200</item>
    </style>

    <style name="subTitle">
        <item name="android:fontFamily">@font/lobstertwo_bold</item>
        <item name="android:textColor">@color/purple_500</item>
        <item name="android:textSize">32sp</item>
    </style>

    <style name="subTitle1">
        <item name="android:fontFamily">@font/fonts</item>
        <item name="android:textStyle">italic</item>
        <item name="android:textColor">@color/purple_500</item>
        <item name="android:textSize">32sp</item>
    </style>

</resources>
```

### Niçin böyle kullanımı tercih ediyoruz? 
- Bazen Google sağladığı paketler silinmiş, güncellenmiş olabilir. Projemizin içinde bulunursa, bu tür sorunları yaşamayız.



## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

P.S. [Bu linkten](https://developer.android.com/guide/topics/resources/animation-resource#Property) faydalanabilirsiniz.

