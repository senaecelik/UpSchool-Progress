# NavigationGraph

Navigation component 3 önemli parçadan oluşur. 
  - Navigation graph (XML dosyası), 
  - NavHost, 
  - NavController

Uygulamadaki tüm hedefleriniz ve gidebileceğiniz yollar nav graph içerisinde bulunur. 
Uygulamada gezinirken NavController’a Navigation graph içerisindeki belirli bir yoldan ya da direkt olarak gitmek istediğiniz hedefi belirtirsiniz. Daha sonra NavController sizin için NavHost’a uygun hedefi gösterir.




- app dosyasının üstüne geliyoruz. Sağ tık yapıyoruz “Android Resource File” a tıklayıp geri kalan konfigurasyonları aşağıdaki gibi yapıyoruz. 
<img align="center" width="800" height="500" src="https://user-images.githubusercontent.com/48855691/168424524-ee4706d1-15a4-4677-9978-a47799a5c22f.jpg">
- Res dizininin altında “navigation” adlı bir dizin oluşacak.
  
  <a href="#"><img align="center" width="800" height="500" src="https://user-images.githubusercontent.com/48855691/168424604-d51a8043-6378-4db4-b1ab-2f00316baeed.jpg">

- Ve açılmasını istediğimiz ilk fragmenti seçiyoruz ben burada “fragment_main” i seçtim.

- Geçmek istediğim diğer fragmente ok çıkararak bağladım. Burada oluşan action ile hangi fragmentdan hangisine geçtiğini görebiliriz.
  
<a href="#"><img align="right" width="400" height="800" src="https://user-images.githubusercontent.com/48855691/168424120-1c335f03-216b-4267-bca5-cf2aa101a39c.gif">

```kotlin
  <fragment
        android:id="@+id/mainFragment"
        android:name="com.senaecelik.navigationgraph.MainFragment"
        android:label="MainFragment" >
        <action
            android:id="@+id/action_mainFragment_to_noMessageFragment"
            app:destination="@id/noMessageFragment" />
    </fragment>
```
  
- Diğer fragmentların XML dosyalarını kodladıktan sonra 'main_fragment' içerisine nav_graph bağlamamız gerekiyor.

```kotlin 
  <androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <androidx.fragment.app.FragmentContainerView
        android:id="@+id/container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:name="androidx.navigation.fragment.NavHostFragment"
        app:defaultNavHost="true" app:navGraph="@navigation/nav_graph"/>
</androidx.constraintlayout.widget.ConstraintLayout>
```
- MainFragment içerisinde dataBinding ile geçiş sağladım. 

```kotlin
  class MainFragment : Fragment() {

    private lateinit var dataBinding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = FragmentMainBinding.inflate(inflater, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        dataBinding.button.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_noMessageFragment)
        }
    }

}
  
```  


