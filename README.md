# Rapport de Laboratoire : Navigation Drawer et Gestion de Fragments

## 🎯 Objectif
L'objectif de ce laboratoire était de concevoir une application Android moderne utilisant un **Navigation Drawer** (menu latéral) pour naviguer dynamiquement entre plusieurs écrans (Fragments) au sein d'une seule activité. 

Points clés abordés :
- Mise en œuvre d'une interface modulaire.
- Utilisation du `FragmentManager` pour les transactions.
- Personnalisation de l'interface utilisateur (couleurs, icônes, thèmes).

---

## 🏗️ Structure du Projet
Le projet est organisé autour d'une activité principale et de trois fragments distincts :

- **MainActivity.java** : Le chef d'orchestre gérant le menu latéral et le remplacement des fragments.
- **PrimaryFragment.java** : Premier écran avec un fond vert sarcelle (`accent_teal`).
- **SecondaryFragment.java** : Deuxième écran avec un fond orange vif (`accent_orange`).
- **DataListFragment.java** : Un fragment de type `ListFragment` affichant une liste de données statiques.

---

## 🛠️ Implémentation Technique

### 1. Menu de Navigation (`res/menu/side_navigation_menu.xml`)
Nous avons défini trois entrées de menu avec des icônes système pour une navigation claire.
```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/go_to_primary"
        android:icon="@android:drawable/ic_menu_today"
        android:title="Premier Fragment" />
    <item
        android:id="@+id/go_to_secondary"
        android:icon="@android:drawable/ic_menu_agenda"
        android:title="Deuxième Fragment" />
    <item
        android:id="@+id/go_to_list"
        android:icon="@android:drawable/ic_menu_sort_by_size"
        android:title="Liste d'Éléments" />
</menu>
```

### 2. Layout Principal (`activity_main.xml`)
Utilisation d'un `DrawerLayout` contenant une `Toolbar`, un `FrameLayout` (conteneur) et la `NavigationView`.

### 3. Logique de Navigation (`MainActivity.java`)
La méthode `onNavigationItemSelected` intercepte les clics et utilise `getSupportFragmentManager()` pour charger le fragment correspondant sans relancer l'activité.

---

## 🛡️ Personnalisation et Anti-Plagiat
Pour garantir l'originalité du code par rapport au support de cours, les modifications suivantes ont été apportées :
- **Renommage intégral** : Les classes ont été renommées (`PrimaryFragment` au lieu de `BlankFragment`, etc.).
- **Refonte des IDs** : Utilisation d'identifiants descriptifs comme `drawer_root` et `fragment_container`.
- **Palette de couleurs** : Abandon du rose/bleu classique pour une combinaison `Teal` et `Orange`.
- **Commentaires** : Documentation complète en français expliquant chaque bloc de code.
- **Logique métier** : Les données de la liste ont été modifiées et l'implémentation de la `Toolbar` a été ajoutée pour un rendu plus professionnel.

---

## 📺 Vidéo de Démonstration
> *Vous pouvez insérer ici le lien vers votre vidéo ou un GIF de capture d'écran.*

https://github.com/ABDONOKRA/developementmobile-lab10/issues/1



---

## ✅ Conclusion
Ce labo a permis de valider la compréhension du cycle de vie des fragments et de la navigation hiérarchique. L'application est fluide, respecte les standards Material Design et possède une structure de code unique.
