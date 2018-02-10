package com.cris.ukulele;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List<UkuleleData> mUkuleleData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.cris.ukulele.R.layout.activity_main);

        mToolbar = findViewById(com.cris.ukulele.R.id.toolbar);
        mToolbar.setTitle(com.cris.ukulele.R.string.app_name);
        mRecyclerView = findViewById(com.cris.ukulele.R.id.recyclerView);
        LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(MainActivity.this,
                LinearLayoutManager.VERTICAL, false);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this,
                DividerItemDecoration.VERTICAL));

        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        UkuleleData mUke;
        mUke = new UkuleleData("Elvis Presley", "Can't Help Falling In Love With You tab",
                "C Em Am F C G\n" +
                        "Wise men say only fools ruuuush in\n" +
                        "F G Am F C G C\n" +
                        "But I can't help falling in loooove with you\n" +
                        "C Em Am F C G\n" +
                        "Shall I stay would it beeee aaaaa sin\n" +
                        "F G Am F C G C\n" +
                        "If I can't help falling in loooove wiiiith you\n" +
                        "\n" +
                        "\n" +
                        "Bridge:\n" +
                        "Em B7 Em B7\n" +
                        "Like a river flooows surely to the sea\n" +
                        "Em B7 Em A7 Dm G\n" +
                        "Darling so it goeeees some things are meant to be\n" +
                        "\n" +
                        "\n" +
                        "C Em Am F C G \n" +
                        "Take my hand take my whooole life too\n" +
                        "F G Am F C G C \n" +
                        "For I can't help faaalling in love with you\n" +
                        "\n" +
                        "\n" +
                        "REPEAT BRIDGE\n" +
                        "\n" +
                        "\n" +
                        "C Em Am F C G \n" +
                        "Take my hand take my whooole life too\n" +
                        "F G Am F C G C \n" +
                        "For I can't help faaalling in love with you\n" +
                        "F G Am F C G C \n" +
                        "For I can't help faaalling in love with you\n" +
                        "\n" +
                        "Source: www.ukulele-tabs.com\n" +
                        "\n");
        mUkuleleData.add(mUke);
        mUke = new UkuleleData("Jason Mraz", "I'm Yours",
                "\n" +
                        "C\n" +
                        "Well you done done me and you bet I felt it\n" +
                        "G\n" +
                        "I tried to be chill but you're so hot that I melted\n" +
                        "Am F\n" +
                        "I fell right through the cracks now I'm trying to get back\n" +
                        "C\n" +
                        "Before the cool done run out I'll be giving it my bestest\n" +
                        "G\n" +
                        "And nothing's going to stop me but divine intervention\n" +
                        "Am F\n" +
                        "I reckon it's again my turn to win some or learn some\n" +
                        "\n" +
                        "\n" +
                        "C G\n" +
                        "But I won't hesitate no more no more\n" +
                        "Am F\n" +
                        "It cannot wait I'm yours\n" +
                        "\n" +
                        "\n" +
                        "C\n" +
                        "Well open up your mind and see like me\n" +
                        "G\n" +
                        "Open up your plans and damn you're free\n" +
                        "Am F\n" +
                        "Look into your heart and you'll find love love love love\n" +
                        "C\n" +
                        "Listen to the music of the moment people dance and sing\n" +
                        "G\n" +
                        "we're just one big family\n" +
                        "Am F\n" +
                        "It's our God-forsaken right to be loved love loved love love\n" +
                        "\n" +
                        "\n" +
                        "C G\n" +
                        "So I won't hesitate no more no more\n" +
                        "Am F\n" +
                        "It cannot wait I'm sure\n" +
                        "C G\n" +
                        "There's no need to complicate our time is short\n" +
                        "Am F\n" +
                        "This is our fate I'm yours\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "D-d-do do you but do you d-d-do\n" +
                        "\n" +
                        "But do you want to come on\n" +
                        "\n" +
                        "Scooch on over closer dear\n" +
                        "\n" +
                        "And I will nibble your ear\n" +
                        "\n" +
                        "\n" +
                        "C\n" +
                        "I've been spending way too long checking my tongue in the mirror\n" +
                        "G\n" +
                        "And bending over backwards just to try to see it clearer\n" +
                        "Am\n" +
                        "But my breath fogged up the glass\n" +
                        "F\n" +
                        "And so I drew a new face and I laughed\n" +
                        "C\n" +
                        "I guess what I be saying is there ain't no better reason\n" +
                        "G\n" +
                        "To rid yourself of vanities and just go with the seasons\n" +
                        "Am F\n" +
                        "It's what we aim to do our name is our virtue\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "But I won't hesitate no more no more\n" +
                        "\n" +
                        "It cannot wait I'm yours\n" +
                        "\n" +
                        "\n" +
                        "C\n" +
                        "Open up your mind and see like me\n" +
                        "\n" +
                        "I won't hesitate\n" +
                        "G\n" +
                        "Open up your plans and damn you're free\n" +
                        "\n" +
                        "No more no more\n" +
                        "Am G\n" +
                        "Look into your heart and you'll find that the sky is yours\n" +
                        "\n" +
                        "It cannot wait I'm sure\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "So please don't please don't please don t\n" +
                        "\n" +
                        "There's no need to complicate\n" +
                        "\n" +
                        "There's no need to complicate\n" +
                        "\n" +
                        "Our time is short\n" +
                        "\n" +
                        "Cause our time is short\n" +
                        "\n" +
                        "This is our fate\n" +
                        "\n" +
                        "This is this is this is our fate\n" +
                        "\n" +
                        "I'm yours\n" +
                        "\n" +
                        "\n" +
                        "C, G Am, F...\n" +
                        "\n");
        mUkuleleData.add(mUke);
        mUke = new UkuleleData("Train", "Soul Sister",
                "Intro:\n" +
                        "\n" +
                        "C     G                Am             F\n" +
                        "Hey-ay Hey-ay-AY-ay-ay Hey-ay-AY-ay-ay\n" +
                        "\n" +
                        "Verse One:\n" +
                        "\n" +
                        "C                    G                         Am            F\n" +
                        "Your lipstick stains on the front lobe of my left side brains\n" +
                        "\n" +
                        "                      C                         G       \n" +
                        "I knew I wouldn't for-get you and so I went and let you blow\n" +
                        "       Am F G\n" +
                        "my mind\n" +
                        "\n" +
                        "C                   G                            Am        \n" +
                        "Your sweet moonbeam the smell of you in every single dream I\n" +
                        "F\n" +
                        "dream\n" +
                        "                  C                              G      \n" +
                        "I knew when we col-lided you're the one I have de-cided who's\n" +
                        "            Am F G\n" +
                        "one of my kind\n" +
                        "\n" +
                        "Chorus:\n" +
                        "\n" +
                        "F               G                 C      G      F\n" +
                        "Hey soul sister ain't that mister mister on the radio stereo\n" +
                        "    G                 C        G\n" +
                        "The way you move aint fair you know\n" +
                        "F               G               C      G      F            G\n" +
                        "Hey soul sister I don't want to miss a single thing you do\n" +
                        "\n" +
                        "   C         G                 Am              F\n" +
                        "To-night Hey-ay Hey-ay-AY-ay-ay Hey-ay-AY-ay-ay\n" +
                        "\n" +
                        "Verse Two:\n" +
                        "\n" +
                        "C              G                           Am                 \n" +
                        "Just in ti-i-i-ime I'm so glad you have a one track mind like\n" +
                        "F\n" +
                        "me\n" +
                        "                     C                           G \n" +
                        "You gave my love dir-ection a game show love con-nection we\n" +
                        "         Am F G\n" +
                        "can't deny-i-iii\n" +
                        "\n" +
                        "    C           G                                 Am \n" +
                        "I'm so obsessed my heart is bound to beat right outta my\n" +
                        "          F\n" +
                        "untrimmed chest\n" +
                        "\n" +
                        "             C                           G                 \n" +
                        "I believe in you like a virgin you're Ma-donna and I'm\n" +
                        "              Am\n" +
                        "always gonna wanna\n" +
                        "\n" +
                        "          F    G\n" +
                        "blow your mind\n" +
                        "\n" +
                        "Chorus:\n" +
                        "\n" +
                        "F               G                 C      G      F\n" +
                        "Hey soul sister ain't that mister mister on the radio stereo\n" +
                        "    G                 C        G\n" +
                        "The way you move aint fair you know\n" +
                        "F               G               C      G      F            G\n" +
                        "Hey soul sister I don't want to miss a single thing you do\n" +
                        "\n" +
                        "Bridge:\n" +
                        "\n" +
                        "   C\n" +
                        "To-night The way you can't cut a rug\n" +
                        "G                               Am\n" +
                        "Watching you's the only drug I need\n" +
                        "\n" +
                        "You're so gangster I'm so thug\n" +
                        "           F                            C\n" +
                        "You're the only one I'm dreaming of you see\n" +
                        "                          G\n" +
                        "I can be myself now final-ly\n" +
                        "                                 Am\n" +
                        "In fact there's nothing I can't be\n" +
                        "                            F       G\n" +
                        "I want the world to see you be with me\n" +
                        "\n" +
                        "Chorus:\n" +
                        "F               G                 C      G      F\n" +
                        "Hey soul sister ain't that mister mister on the radio stereo\n" +
                        "    G                 C        G\n" +
                        "The way you move aint fair you know\n" +
                        "F               G               C      G      F            G\n" +
                        "Hey soul sister I don't want to miss a single thing you do\n" +
                        "   G  C  G\n" +
                        "to-night\n" +
                        "F               G               C      G      F               G\n" +
                        "Hey soul sister I don't want to miss a single thing you do-oooo\n" +
                        "\n" +
                        "     C         G                 Am              F\n" +
                        "To-night Hey-ay Hey-ay-AY-ay-ay Hey-ay-AY-ay-ay\n" +
                        "   C         G                 Am              F\n" +
                        "To-night Hey-ay Hey-ay-AY-ay-ay Hey-ay-AY-ay-ay\n" +
                        "C\n" +
                        "To-night");
        mUkuleleData.add(mUke);
        mUke = new UkuleleData("Vance Joy", "Riptide",
                "\n" +
                        "Am G C (x2)\n" +
                        "\n" +
                        "Am G C\n" +
                        "I was scared of dentists and the dark\n" +
                        "Am G C\n" +
                        "I was scared of pretty girls and starting conversations\n" +
                        "Am G C\n" +
                        "Oh all my friends are turning green\n" +
                        "Am G C\n" +
                        "You're the magicians assistant in their dreams\n" +
                        "\n" +
                        "Am G C\n" +
                        "Ooh ooh ooh\n" +
                        "Am G C (hold)\n" +
                        "Ooh and they come unstuck\n" +
                        "\n" +
                        "Am G C\n" +
                        "Lady running down to the riptide\n" +
                        "C Am\n" +
                        "taken away to the dark side\n" +
                        "G C\n" +
                        "I wanna be your left hand man\n" +
                        "Am G C\n" +
                        "I love you when you're singing that song and\n" +
                        "C Am\n" +
                        "I got a lump in my throat 'cause\n" +
                        "G C\n" +
                        "you're gonna sing the words wrong\n" +
                        "\n" +
                        "Am G C\n" +
                        "There's this movie that I think you'll like\n" +
                        "Am G C\n" +
                        "this guy decides to quit his job and heads to New York City\n" +
                        "Am G C\n" +
                        "this cowboy's running from himself\n" +
                        "Am G C\n" +
                        "And she's been living on the highest shelf\n" +
                        "\n" +
                        "Am G C\n" +
                        "Ooh ooh ooh\n" +
                        "Am G C (hold)\n" +
                        "Ooh and they come unstuck\n" +
                        "\n" +
                        "Am G C\n" +
                        "Lady running down to the riptide\n" +
                        "C Am\n" +
                        "taken away to the dark side\n" +
                        "G C\n" +
                        "I wanna be your left hand man\n" +
                        "Am G C\n" +
                        "I love you when you're singing that song and\n" +
                        "C Am\n" +
                        "I got a lump in my throat 'cause\n" +
                        "G C\n" +
                        "you're gonna sing the words wrong\n" +
                        "\n" +
                        "\n" +
                        "Am Gsus4 G\n" +
                        "I just wanna I just wanna know\n" +
                        "C Fadd9\n" +
                        "If you're gonna if you're gonna stay\n" +
                        "Am Gsus4 G\n" +
                        "I just gotta I just gotta know\n" +
                        "C Fadd9 (strum and hold)\n" +
                        "I can't have it I can't have it any other way\n" +
                        "\n" +
                        "Strum once and hold\n" +
                        "Am G C\n" +
                        "I swear she's destined for the screen\n" +
                        "Am G C\n" +
                        "Closest thing to Michelle Pfeiffer that you've ever seen oh\n" +
                        "\n" +
                        "\n" +
                        "Am G C\n" +
                        "Lady running down to the riptide\n" +
                        "C Am\n" +
                        "taken away to the dark side\n" +
                        "G C\n" +
                        "I wanna be your left hand man\n" +
                        "Am G C\n" +
                        "I love you when you're singing that song and\n" +
                        "C Am\n" +
                        "I got a lump in my throat 'cause\n" +
                        "G C\n" +
                        "you're gonna sing the words wrong\n" +
                        "\n" +
                        "Am G C\n" +
                        "Lady running down to the riptide\n" +
                        "C Am\n" +
                        "taken away to the dark side\n" +
                        "G C\n" +
                        "I wanna be your left hand man\n" +
                        "Am G C\n" +
                        "I love you when you're singing that song and\n" +
                        "C Am\n" +
                        "I got a lump in my throat 'cause\n" +
                        "G C\n" +
                        "you're gonna sing the words wrong\n" +
                        "\n" +
                        "Am G C\n" +
                        "Lady running down to the riptide\n" +
                        "C Am\n" +
                        "taken away to the dark side\n" +
                        "G C\n" +
                        "I wanna be your left hand man\n" +
                        "Am G C\n" +
                        "I love you when you're singing that song and\n" +
                        "C Am\n" +
                        "I got a lump in my throat 'cause\n" +
                        "G C\n" +
                        "you're gonna sing the words wrong\n" +
                        "C Am G C\n" +
                        "I got a lump in my throat 'cause you're gonna sing the words wrong\n" +
                        "\n");
        mUkuleleData.add(mUke);
        mUke = new UkuleleData("John Lennon", "Imagine",
                "\n" +
                        "1st Verse :\n" +
                        "C              (Cmaj7) F\n" +
                        "Imagine there's no heaven\n" +
                        "C           (Cmaj7) F\n" +
                        "It's easy if you try\n" +
                        "C      (Cmaj7) F\n" +
                        "No hell below us\n" +
                        "C       (Cmaj7) F  \n" +
                        "Above us only sky\n" +
                        "F   -    Am   -    Dm  -   F    -  \n" +
                        "Imagine all the people\n" +
                        "G Gx\n" +
                        "Living for today ah ah ahah\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "2nd verse:\n" +
                        "C              (Cmaj7)  F\n" +
                        "Imagine there's no countries\n" +
                        "C            (Cmaj7) F\n" +
                        "It isn't hard to do\n" +
                        "C              (Cmaj7) F\n" +
                        "Nothing to kill or die for\n" +
                        "C          (Cmaj7) F\n" +
                        "And no religion too\n" +
                        "F   -    Am   -    Dm  -   F    -\n" +
                        "Imagine all the people\n" +
                        "G Gx\n" +
                        "Living life in peace oh oh ohoh\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Chorus:\n" +
                        "F   -    G    -    C    -    E7      -\n" +
                        "You may say I'm a dreamer\n" +
                        "F   -    G    -        C  -  E7     -\n" +
                        "But I'm not the only one\n" +
                        "F     -      G    -     C   -   E7     -\n" +
                        "I hope some day you'll join us\n" +
                        "F   -    G     -    C>let ring\n" +
                        "And the world will be as one\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "3rd Verse:\n" +
                        "C         (Cmaj7) F\n" +
                        "Imagine no possessions\n" +
                        "C          (Cmaj7) F\n" +
                        "I wonder if you can\n" +
                        "C               (Cmaj7) F\n" +
                        "No need for greed or hunger\n" +
                        "C             (Cmaj7) F\n" +
                        "A brother hood of man\n" +
                        "F   -   Am   -     Dm  -   F    -\n" +
                        "Imagine all the people\n" +
                        "G Gx\n" +
                        "Sharing all the World oh oh ohoh\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Chorus:\n" +
                        "F   -    G    -    C    -    E7      -\n" +
                        "You may say I'm a dreamer\n" +
                        "F   -    G    -        C  -  E7     -\n" +
                        "But I'm not the only one\n" +
                        "F     -      G    -     C   -   E7     -\n" +
                        "I hope some day you'll join us\n" +
                        "F   -    G     -    C>let ring\n" +
                        "And the world will be as one\n" +
                        "\n");
        mUkuleleData.add(mUke);
        mUke = new UkuleleData("Luis Fonsi", "Despacito", "Ay...\n" +
                "Fonsi\n" +
                "Oh oh\n" +
                "Oh no oh no\n" +
                "Oh...\n" +
                "Yeah...\n" +
                "Dididiri Daddy\n" +
                "Go!\n" +
                "Bm                             G\n" +
                "Si sabes que ya llevo rato mirándote\n" +
                " D                        A\n" +
                "Tengo que bailar contigo hoy DY\n" +
                " Bm                             G\n" +
                "Vi que tu mirada ya estaba llamándome\n" +
                " D                          A\n" +
                "Muéstrame el camino que yo voy oh\n" +
                " Bm                               G\n" +
                "Tú tú eres el imán y yo soy el metal\n" +
                "                                  D\n" +
                "Me voy acercando y voy armando el plan\n" +
                "                                A\n" +
                "Solo con pensarlo se acelera el pulso oh yeah\n" +
                "Bm                                    G\n" +
                "Ya ya me está gustando más de lo normal\n" +
                "                                 D\n" +
                "Todos mis sentidos van pidiendo más\n" +
                "                                  A\n" +
                "Esto hay que tomarlo sin ningún apuro\n" +
                "     Bm\n" +
                "Despacito\n" +
                "                               G\n" +
                "Quiero respirar tu cuello despacito\n" +
                "                           D\n" +
                "Deja que te diga cosas al oído\n" +
                "                                     A\n" +
                "Para que te acuerdes si no estás conmigo\n" +
                "     Bm\n" +
                "Despacito\n" +
                "                               G\n" +
                "Quiero desnudarte a besos despacito\n" +
                "                               D\n" +
                "Firmo en las paredes de tu laberinto\n" +
                "                                   A\n" +
                "Y hacer de tu cuerpo todo un manuscrito\n" +
                "\n" +
                "Sube sube sube sube sube\n" +
                "Bm\n" +
                "Quiero ver bailar tu pelo\n" +
                "              G\n" +
                "Quiero ser tu ritmo\n" +
                "                    D\n" +
                "Que le enseñes a mi boca\n" +
                "                A\n" +
                "Tus lugares favoritos favorito favorito baby\n" +
                "Bm                               G\n" +
                "Déjame sobrepasar tus zonas de peligro\n" +
                "G                  D\n" +
                "Hasta provocar tus gritos\n" +
                "                    A\n" +
                "Y que olvides tu apellido\n" +
                "    A             D\n" +
                "Si te pido un beso ven dármelo\n" +
                "   D   \n" +
                "Yo sé que estás pensándolo\n" +
                "   G\n" +
                "Llevo tiempo intentándolo\n" +
                "        G\n" +
                "Mami esto es dando y dándolo\n" +
                "         D\n" +
                "Sabes que tu corazón conmigo te hace bom bom\n" +
                "    A                             D\n" +
                "Sabes que esa beba está buscando de mi bom bom\n" +
                "     Bm\n" +
                "Ven prueba de mi boca para ver como te sabe\n" +
                "     G\n" +
                "Quiero quiero quiero ver cuanto amor a ti te cabe\n" +
                "     G                     D\n" +
                "Yo no tengo prisa yo me quiero dar el viaje\n" +
                "A \n" +
                "Empezamos lento después salvaje\n" +
                "            A               Bm\n" +
                "Pasito a pasito suave suavecito\n" +
                "            Bm                 G\n" +
                "Nos vamos pegando poquito a poquito\n" +
                "             G                 D \n" +
                "Cuando tú me besas con esa destreza\n" +
                "               A           \n" +
                "Veo que eres malicia con delicadeza\n" +
                "           Bm               G\n" +
                "Pasito a pasito suave suavecito\n" +
                "                               D\n" +
                "Nos vamos pegando poquito a poquito\n" +
                "\n" +
                "Y es que esa belleza es un rompecabezas\n" +
                "            A\n" +
                "Pero pa' montarlo aquí tengo la pieza\n" +
                "     Bm\n" +
                "Despacito\n" +
                "                               G\n" +
                "Quiero respirar tu cuello despacito\n" +
                "                          D\n" +
                "Deja que te diga cosas al oído\n" +
                "                                    A\n" +
                "Para que te acuerdes si no estás conmigo\n" +
                "     Bm\n" +
                "Despacito\n" +
                "                               G\n" +
                "Quiero desnudarte a besos despacito\n" +
                "                               D\n" +
                "Firmo en las paredes de tu laberinto\n" +
                "                                  A\n" +
                "Y hacer de tu cuerpo todo un manuscrito\n" +
                "\n" +
                "Sube sube sube sube sube\n" +
                "Bm \n" +
                "Quiero ver bailar tu pelo\n" +
                "              G\n" +
                "Quiero ser tu ritmo\n" +
                "                    D\n" +
                "Que le enseñes a mi boca\n" +
                "                A\n" +
                "Tus lugares favoritos favorito favorito baby\n" +
                "Bm                               G\n" +
                "Déjame sobrepasar tus zonas de peligro\n" +
                "                   D\n" +
                "Hasta provocar tus gritos\n" +
                "                    A\n" +
                "Y que olvides tu apellido\n" +
                "    Bm\n" +
                "Despacito\n" +
                "                                     G\n" +
                "Vamo' hacerlo en una playa en Puerto Rico\n" +
                "                                 D\n" +
                "Hasta que las olas griten ‘ay bendito'\n" +
                "                                 A\n" +
                "Para que mis hechos se queden contigo\n" +
                "           Bm               \n" +
                "Pasito a pasito suave suavecito\n" +
                "            G                  D\n" +
                "Nos vamos pegando poquito a poquito\n" +
                "\n" +
                "Que le enseñes a mi boca\n" +
                "                A \n" +
                "Tus lugares favoritos favorito favorito baby\n" +
                "           Bm\n" +
                "Pasito a pasito suave suavecito\n" +
                "            G                  D\n" +
                "Nos vamos pegando poquito a poquito\n" +
                "G                   D\n" +
                "Hasta provocar tus gritos Fonsi\n" +
                "                     A\n" +
                "Y que olvides tu apellido DY\n" +
                "A    Bm\n" +
                "Despacito\n");
        mUkuleleData.add(mUke);

        UkuleleAdapter mUkuleleAdapter = new UkuleleAdapter(MainActivity.this, mUkuleleData);
        mRecyclerView.setAdapter(mUkuleleAdapter);

    }
}
