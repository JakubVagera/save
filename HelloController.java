package com.example.puzzlegame;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
//import javafx.scene.media.MediaPlayer;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Random;


//import static jdk.internal.org.jline.keymap.KeyMap.display;

public class HelloController extends Thread {

    @FXML
    Button b_start;
    @FXML
    Button b_return;
    @FXML
    Button A2_close;
    @FXML
    Button A2_open;
    @FXML
    Button A1;
    @FXML
    Button b_continue;
    @FXML
    Label Text;
    @FXML
    Button right;
    @FXML
    Button left;
    @FXML
    Button b_Aa2_1;
    @FXML
    Button b_Aa2_2;
    @FXML
    Button b_Aa2_3;
    @FXML
    Button b_Aa2_4;
    @FXML
    AnchorPane pane;

    @FXML
    ImageView over_image;
    @FXML
    Button back;
    @FXML
    Button inventory1;
    @FXML
    Button inventory2;
    @FXML
    Button inventory3;
    @FXML
    Button inventory4;
    @FXML
    Button inventory5;
    @FXML
    Button inventory6;
    @FXML
    Button inventory7;
    @FXML
    Button inventory8;
    @FXML
    Button inventory9;
    @FXML
    Button inventory10;
    @FXML
    Button inventory11;
    @FXML
    Button inventory12;
    @FXML
    Button inventory13;
    @FXML
    Button Aa1_b1;
    @FXML
    Button Aa1_b2;
    @FXML
    Button Aa1_b3;
    @FXML
    Button Aa1_b4;
    @FXML
    Button Aa1_b5;
    @FXML
    Button Aa1_b6;
    @FXML
    Button Aa1_b7;
    @FXML
    Button Aa1_b8;
    @FXML
    Button Aa1_b9;
    @FXML
    Button Aa1_b10;
    @FXML
    Button Aa1_b11;
    @FXML
    Button Aa1_b12;
    @FXML
    Button Aa1_b13;
    @FXML
    Button Aa1_b14;
    @FXML
    Button Aa3_b1;
    @FXML
    Button Aa3_b2;
    @FXML
    Button Aa3_b3;
    @FXML
    Button Aa3_b4;
    @FXML
    Button Aa3_b5;
    @FXML
    ImageView B1a_open;
    @FXML
    ImageView B1b_open ;
    @FXML
    Button B1a_close;
    @FXML
    Button B1b_close;
    @FXML
    Button Bb1a_close;
    @FXML
    Button Bb1b_close;
    @FXML
    Button Bb1a_open;
    @FXML
    Button Bb1b_open;
    @FXML
    Button B2;
    @FXML
    Button B3;


    @FXML
    Button door;
    @FXML
    Button door_key1;
    @FXML
    Button door_key2;

    @FXML
    ImageView image1;
    @FXML
    ImageView image2;
    @FXML
    ImageView image3;
    @FXML
    ImageView image4;
    @FXML
    ImageView image5;
    @FXML
    ImageView image6;
    @FXML
    ImageView image7;
    @FXML
    ImageView image8;
    @FXML
    ImageView image9;
    @FXML
    ImageView image10;
    @FXML
    ImageView image11;
    @FXML
    ImageView image12;
    @FXML
    ImageView image13;


    @FXML
    ImageView A_door_open;
    @FXML
    Button A3;
    @FXML
    Button A4;
    @FXML
    Button A5;
    @FXML
    ImageView Thing1_A;
    @FXML
    Button Thing1_a;
    @FXML
    ImageView Aa1_im1;
    @FXML
    ImageView Aa1_im2;
    @FXML
    ImageView Aa1_im3;
    @FXML
    ImageView Aa1_im4;
    @FXML
    ImageView Aa1_im5;
    @FXML
    ImageView Aa1_im6;
    @FXML
    ImageView Aa1_im7;
    @FXML
    ImageView Aa1_im8;
    @FXML
    ImageView Aa1_im9;
    @FXML
    ImageView Aa1_im10;
    @FXML
    ImageView Aa1_im11;
    @FXML
    ImageView Aa1_im12;
    @FXML
    ImageView Aa2_open;
    @FXML
    ImageView Aa2_close;
    @FXML
    ImageView Aa1_open;
    @FXML
    ImageView Aa1_close;
    @FXML
    ImageView Aa4_card;
    @FXML
    Button Aa4_b;
    @FXML
    ImageView Aa5_up;
    @FXML
    ImageView Aa5_down;
    @FXML
    Button Aa5_wheel;
    @FXML
    ImageView i_help;
    @FXML
    ImageView A1_open;
    @FXML
    Button Aa1_open_b;
    @FXML
    ImageView idoor1;
    @FXML
    Button save;
    @FXML
    ImageView Bb3_back;
    @FXML
    ImageView Bb3_door_up;
    @FXML
    ImageView Bb3_door_down;
    @FXML
    ImageView Bb3_im1_up;
    @FXML
    ImageView Bb3_im1_down;
    @FXML
    ImageView Bb3_im2_up;
    @FXML
    ImageView Bb3_im2_down;
    @FXML
    ImageView Bb3_im3_up;
    @FXML
    ImageView Bb3_im3_down;
    @FXML
    ImageView Bb3_im4_up;
    @FXML
    ImageView Bb3_im4_down;
    @FXML
    Button Bb3_b1;
    @FXML
    Button Bb3_b2;
    @FXML
    Button Bb3_b3;
    @FXML
    Button Bb3_b4;
    @FXML
    Button Bb3_b5;
    @FXML
    Button Bb3_b6;
    @FXML
    Button Bb3_b7;
    @FXML
    Button Bb3_b8;
    @FXML
    Button Bb3_im_code1;
    @FXML
    Button Bb3_im_code2;
    @FXML
    Button Bb3_im_code3;
    @FXML
    Button B3_im_code1;
    @FXML
    Button B3_im_code2;
    @FXML
    Button B3_im_code3;
    @FXML
    Label Number_code_room_B;
    @FXML
    Button C1_b1;
    @FXML
    Button C1_b2;
    @FXML
    Button C1_b3;
    @FXML
    Button C1_b4;
    @FXML
    Button C1_b5;
    @FXML
    Button C1_b6;
    @FXML
    Button C1_b7;
    @FXML
    Button C1_b8;
    @FXML
    Button C1_b9;
    @FXML
    Button C1_door;
    @FXML
    Button Cc1_b1;
    @FXML
    Button Cc1_b2;
    @FXML
    Button Cc1_b3;
    @FXML
    Button Cc1_b4;
    @FXML
    Button Cc1_b5;
    @FXML
    Button Cc1_b6;
    @FXML
    Button Cc1_b7;
    @FXML
    Button Cc1_b8;
    @FXML
    Button Cc1_b9;
    @FXML
    Button Cc1_door;
    @FXML
    Button C3;
    @FXML
    Button Cc3_b1;
    @FXML
    Button Cc3_b2;
    @FXML
    Button Cc3_b3;
    @FXML
    Button Cc3_b4;
    @FXML
    Button Cc3_b5;
    @FXML
    Button Cc3_b6;
    @FXML
    Button Cc3_b7;
    @FXML
    Button Cc3_b8;
    @FXML
    Button Cc3_b9;
    @FXML
    Label Cc3_text;
    @FXML
    Button C2;
    @FXML
    Button Cc2_b;
    @FXML
    Button C4;
    @FXML
    Button Cc4_b;
    @FXML
    Button D1;
    @FXML
    Button Dd1;
    @FXML
    Button Dd1d1_b1;
    @FXML
    Button Dd1d1_b2;
    @FXML
    Button Dd1d1_b3;
    @FXML
    Button Dd1d1_b4;
    @FXML
    Button C_door;
    @FXML
    ImageView C_door_open;
    @FXML
    Button E_door;
    @FXML
    ImageView E3_open;
    @FXML
    Button E3;
    @FXML
    ImageView Ee3_open;
    @FXML
    ImageView Ee3_close;
    @FXML
    Button Ee3_b1;
    @FXML
    Button Ee3_b2;
    @FXML
    Button Ee3_b3;
    @FXML
    Button Ee3_b4;
    @FXML
    Button E2_b1;
    @FXML
    Button E2_b2;
    @FXML
    Button E2_b3;
    @FXML
    Button Ee2_b1;
    @FXML
    Button Ee2_b2;
    @FXML
    Button Ee2_b3;
    @FXML
    Button E1;
    @FXML
    Button Ee1_b1;
    @FXML
    Button Ee1_b2;
    @FXML
    Button Ee1_b3;
    @FXML
    Button Ee1_b4;
    @FXML
    Button Ee1_b5;
    @FXML
    Button Ee1_reset;
    @FXML
    ImageView Ee1_door;
    @FXML
    Button F2_b1;
    @FXML
    Button F2_b2;
    @FXML
    Button F2_b3;
    @FXML
    Button F2_b4;
    @FXML
    Button F2_door;
    @FXML
    Button F1;
    @FXML
    Button Ff1;
    @FXML
    Button Ff1f1_b1;
    @FXML
    Button Ff1f1_b2;
    @FXML
    Button Ff2_b1;
    @FXML
    Button Ff2_b2;
    @FXML
    Button Ff2_b3;
    @FXML
    Button Ff2_b4;
    @FXML
    ImageView Ff2_door;
    @FXML
    ImageView G1_ring1;
    @FXML
    ImageView G1_ring2;
    @FXML
    ImageView G1_ring3;
    @FXML
    ImageView G1_ring4;
    @FXML
    Button G1_button;
    @FXML
    Button G1_touch_area;
    @FXML
    Button Gg1_b1;
    @FXML
    Button Gg1_b2;
    @FXML
    Button Gg1_b3;
    @FXML
    Button Gg1_b4;
    @FXML
    Button Gg1_door;
    @FXML
    Button Gg1_b_1;
    @FXML
    Button Gg1_b_2;
    @FXML
    Button Gg1_b_3;
    @FXML
    Button Gg1_b_4;
    @FXML
    ImageView H2_open;
    @FXML
    Button H2;
    @FXML
    ImageView Hh2_open;
    @FXML
    Button Hh2_close;
    @FXML
    Button Hh2_1_color;
    @FXML
    Button Hh2_2_color;
    @FXML
    Button Hh2_3_color;
    @FXML
    Button Hh2_4_color;
    @FXML
    Button Hh2_b1a;
    @FXML
    Button Hh2_b1b;
    @FXML
    Button Hh2_b2a;
    @FXML
    Button Hh2_b2b;
    @FXML
    Button Hh2_b3a;
     @FXML
    Button Hh2_b3b;
    @FXML
    Button Hh2_b4a;
    @FXML
    Button Hh2_b4b;
    @FXML
    Button H1;
    @FXML
    Button Hh1_b;
    @FXML
    Button H3;
    @FXML
    Button Hh3_b;
    @FXML
    ImageView One;
    @FXML
    ImageView Two;
    @FXML
    ImageView Three;
    @FXML
    ImageView Four;
    @FXML
    ImageView Five;
    @FXML
    ImageView Six;
    @FXML
    ImageView H2_clue_1;
    @FXML
    ImageView H2_clue_2;
    @FXML
    ImageView H2_clue_3;
    @FXML
    ImageView H2_clue_4;

    private Stage stage;
    private Scene scene;
    private Parent root;
    static int room_index  = 1;
    static int[] things = new int[13];
    static int[] inventory = new int[13];
    static int[] indexs = new int[30];
    static int[] Bb3_press = new int[8];
    static int[] Bb3_answer = new int[8];

    static int[] Aa2buttons = new int[4];
    static int[] Aa2code = new int[4];
    static int[][] Aa1code = new int[3][4];
    static int[][] Aa1answer = new int[3][4];

    static int[][] Cc1answer = new int[3][3];
    static int[][] Cc1code = new int[3][3];
    static int actual_thing  = 0;

    static int door_key1_index  = 0;
    static int door_key2_index  = 0;
    static int door1_index  = 0;

    static int empty_space  = 0;
    static int help_int  = 0;
    static int Aa1_mismatch  = 0;
    static int item_elimination  = 0;
    static int previous_actual_thing  = 0;
    static int Bb3_count  = 0;
    static int Cc1_mismatch  = 0;

    static int Cc3_code  = 0;
    static int Cc3_rounds  = 1;
    static int Cc3_answer  = 0;
    static int Cc3_mismatch  = 0;
    static int Cc2_press  = 0;
    static int Cc4_press  = 0;
    static int Ee1_mismatch  = 0;
    static int Ff1_mismatch  = 0;
    static int Ff2_mismatch  = 0;
    static int Gg1_mismatch  = 0;
    static int count_blink1  = 0;
    static int count_blink2  = 0;
    static int count_blink3  = 0;
    static int count_blink4  = 0;
    static int z1 = 1;
    static int z2 = 1;
    static int z3 = 1;
    static int z4 = 1;
    static int u1 = 0;
    static int u2 = 0;
    static int u3 = 0;
    static int u4 = 0;

    static int[] Aa3code = new int[5];
    static int[] Aa3answer = new int[5];
    static int[] Dd1d1code = new int[4];
    static int[] Dd1d1answer = new int[4];
    static int[] E3code = new int[4];
    static int[] E3answer = new int[4];
    static int[] E1code = new int[5];
    static int[] E1answer = new int[5];
    static int[] F1code = new int[2];
    static int[] F1answer = new int[2];
    static int[] F2code = new int[4];
    static int[] F2answer = new int[4];
    static int[] G1code = new int[4];
    static int[] G1answer = new int[4];
    static int[][] Number_phone_C3 = new int[][] { {9,5,6,4,1,6,4}, {4,5,6,4,6,4,6}, {1,9,3,7,5,1,5}, {8,8,5,7,9,3,4}, {2,1,2,3,4,5,8}, {6,8,9,1,6,1,6}, {7,8,6,5,4,9,9} };
    static int[][] C3_answer_help = new int[2][6];
    static String p_A = "A_room.jpg";
    static String p_B = "B_room.jpg";
    static String p_C = "C_room.png";
    static String p_D = "D_room.jpg";
    static String p_E = "E_room.jpg";
    static String p_F = "F_room.jpg";
    static String p_G = "G_room.jpg";
    static String p_H = "Hr.jpg";

    static String im_A1_close = "A1_close.jpg";
    static String im_A1_open = "A1_open.jpg";
    static String im_A2_close = "A2_close.jpg";
    static String im_A2_open = "A2_open.jpg";
    static String im_Aa1_button = "A-1.button.png";
    static String im_Aa1_close = "A-1.close.jpg";
    static String im_Aa1_open = "A-1.open.jpg";
    static String im_Aa1_im1 = "A-1.im.1.jpg";
    static String im_Aa1_im2 = "A-1.im.2.jpg";
    static String im_Aa1_im3 = "A-1.im.3.jpg";
    static String p_A1 = "A-1r.jpg";
    static String im_Aa2_close = "A-2.close.jpg";
    static String im_Aa2_open = "A-2.open.jpg";
    static String p_A2 = "A-2r.jpg";
    static String p_A3 = "A-3.png";
    static String im_A5_open = "A5_open.jpg";
    static String p_A4 = "A-4.png";
    static String p_A5 = "A-5r.jpg";
    static String p_B1 = "B-1r.jpg";
    static String p_B2 = "B-2.png";
    static String p_B3 = "B-3r.jpg";
    static String im_B1a_close = "B1aclose.jpg";
    static String im_B1b_close = "B1b.close.jpg";
    static String im_C1_1 = "C1.1.jpg";
    static String im_C1_2 = "C1.2.jpg";
    static String im_C1_3 = "C1.3.jpg";
    static String im_C1_4 = "C1.4.jpg";
    static String im_C1_5 = "C1.5.jpg";
    static String im_C1_6 = "C1.6.jpg";
    static String im_C1_7 = "C1.7.jpg";
    static String im_C1_8 = "C1.8.jpg";
    static String im_C_1_1 = "C-1.1.jpg";
    static String im_C_1_2 = "C-1.2.jpg";
    static String im_C_1_3 = "C-1.3.jpg";
    static String im_C_1_4 = "C-1.4.jpg";
    static String im_C_1_5 = "C-1.5.jpg";
    static String im_C_1_6 = "C-1.6.jpg";
    static String im_C_1_7 = "C-1.7.jpg";
    static String im_C_1_8 = "C-1.8.jpg";
    static String p_C1 = "C-1r.jpg";
    static String p_C2 = "C-2.png";
    static String p_C4 = "C-4.png";
    static String im_D1_open = "D1.open.jpg";
    static String im_D1_close = "D1.close.jpg";
    static String p_D1 = "D-1r.jpg";
    //static String p_D_1 = "D-1r.jpg";
    static String im_D1_1_close = "D-1.png";
    static String im_D1_1_open = "D-1.open.jpg";

    static String p_D1_1_1_close = "D-1.1.png";
    static String p_D1_1_1_open = "D-1.1.open.jpg";
    static String p_E1 = "E-1r.jpg";
    static String p_E2 = "E-2r.jpg";
    static String p_E3 = "E-3r.jpg";

    static String im_E1_1_door_close = "E-1.door.close.jpg";
    static String im_E1_1_door_open = "E-1.door.open.jpg";
    static String im_E1_close = "E1.close.jpg";
    static String im_E1_open = "E1.open.jpg";
    static String im_E1_1_key_up = "E-1.key.up.jpg";
    static String im_E1_1_key_down = "E-1.key.down.jpg";
    static String im_E2_close = "E2.close.jpg";
    static String im_E2_open = "E2.open.jpg";
    static String im_E2_1_door_close = "E-2.close.jpg";
    static String im_E2_1_door_open = "E-2.open.jpg";
    static String p_F1 = "F-1r.jpg";
    static String p_F2 = "F-2.png";
    static String p_F1_open = "F1.open.jpg";
    static String p_F1_close = "F1.close.jpg";
    static String im_F1_1_close = "F-1.close.jpg";
    static String im_F1_1_open = "F-1.open.jpg";
    static String p_F1_1_1 = "F-1.1r.jpg";
    static String p_F1_1_2 = "F-1.2.png";
    static String p_G1 = "G-1r.jpg";
    static String p_H1 = "H-1r.jpg";
    static String im_H1_without = "H-1.without.png";
    static String im_H1_with = "H-1.with.jpg";
    static String p_H2 = "H-2r.jpg";
    static String p_H3 = "H-3.png";
    static String p_H3_1 = "H-3.1.png";
    static String thing1i = "Thing1i.jpg";
    /*static String p_E1 = "E-1r.jpg";
    static String p_E1 = "E-1r.jpg";*/
    static String over1 = "over1.jpg";

    /*static String one = "one.png";
    static String two = "one.png";
    static String three = "one.png";
    static String four = "one.png";
    static String five = "one.png";
    static String six = "one.png";*/



    static String p_c3 = "C_3.png";
    static int door_sound_help = 0;
   TranslateTransition translate1 = new TranslateTransition();
    TranslateTransition translate2 = new TranslateTransition();
    TranslateTransition translate3 = new TranslateTransition();
    TranslateTransition translate4 = new TranslateTransition();
    TranslateTransition translate5 = new TranslateTransition();
    TranslateTransition translate6 = new TranslateTransition();
    TranslateTransition translate7 = new TranslateTransition();
    TranslateTransition translate8 = new TranslateTransition();
    TranslateTransition translate9 = new TranslateTransition();
    TranslateTransition translate10 = new TranslateTransition();
    TranslateTransition translate11 = new TranslateTransition();
    TranslateTransition translate12 = new TranslateTransition();
    TranslateTransition trans_bar_1 = new TranslateTransition();
    TranslateTransition trans_bar_2 = new TranslateTransition();
    TranslateTransition trans_bar_3 = new TranslateTransition();
    RotateTransition rt = new RotateTransition();
    FadeTransition ft = new FadeTransition();

         static String s = "cant-help-falling-in-love-audio.mp3";
        static Media h = new Media(Paths.get(s).toUri().toString());
        static MediaPlayer mediaPlayer = new MediaPlayer(h);

        //static String r = "door-open-sound-effect.mp3";
        static String r = "oooo.mp3";
        static Media t = new Media(Paths.get(r).toUri().toString());
        static MediaPlayer dooropen = new MediaPlayer(t);

        static String k =  "piano-note-a_A_major (mp3cut.net).wav";
        //static String k = "piano_note_A.mp3";
        static Media l = new Media(Paths.get(k).toUri().toString());
        static MediaPlayer A_note = new MediaPlayer(l);

        static String o =  "piano-note-b_B_major (mp3cut.net).wav";
        //static String o = "piano_note_B.mp3";
        static Media p = new Media(Paths.get(o).toUri().toString());
        static MediaPlayer B_note = new MediaPlayer(p);


        static String q =  "piano-note-c_C_major (mp3cut.net).wav";
        //static String q = "piano_note_C.mp3";
        static Media u = new Media(Paths.get(q).toUri().toString());
        static MediaPlayer C_note = new MediaPlayer(u);


        static String w =  "piano-note-d_D_major (mp3cut.net).wav";
        //static String w = "piano_note_D.mp3";
        static Media e = new Media(Paths.get(w).toUri().toString());
        static MediaPlayer D_note = new MediaPlayer(e);

        static String n =  "piano-note-e_E_major (mp3cut.net).wav";
    //static String w = "piano_note_D.mp3";
        static Media m = new Media(Paths.get(n).toUri().toString());
        static MediaPlayer E_note = new MediaPlayer(m);
       //private AudioClip clip = new AudioClip(r);
        //AudioClip clip = new AudioClip(this.getClass().getResource(r).toExternalForm());
        public void background_music(){
            mediaPlayer.setVolume(0.00);
        mediaPlayer.play();
        mediaPlayer.setStartTime(Duration.seconds(0));
        //mediaPlayer.setCycleCount(10);
        //mediaPlayer.setStopTime(Duration.seconds(5));
        mediaPlayer.setCycleCount(100000);
    }
    public static void A_note_play(){
        A_note.setVolume(0.01);
        A_note.seek(Duration.ZERO);
        A_note.play();
        A_note.setStartTime(Duration.seconds(0));
        //mediaPlayer.setCycleCount(10);
        //mediaPlayer.setStopTime(Duration.seconds(5));
        //.setCycleCount(100000);
    }
    public static void B_note_play() {
        B_note.setVolume(0.01);
        B_note.seek(Duration.ZERO);
        B_note.play();
        B_note.setStartTime(Duration.seconds(0));
    }
    public static void C_note_play() {
        C_note.setVolume(0.01);
        C_note.seek(Duration.ZERO);
        C_note.play();
        C_note.setStartTime(Duration.seconds(0));
    }
    public static void D_note_play() {
        D_note.setVolume(0.01);
        D_note.seek(Duration.ZERO);
        D_note.play();
        D_note.setStartTime(Duration.seconds(0));
    }
    public static void E_note_play() {
        E_note.setVolume(0.01);
        E_note.seek(Duration.ZERO);
        E_note.play();
        E_note.setStartTime(Duration.seconds(0));
    }
    public void door_music() {
       dooropen.setAutoPlay(true);
        dooropen.seek(Duration.ZERO);
            dooropen.play();
        dooropen.setCycleCount(1);
        //dooropen.setCycleCount(1);
        //dooropen.setStopTime(Duration.seconds(2));
        //long t= System.currentTimeMillis();
        //long end = (long) (t+499);
        /*if(dooropen.isAutoPlay() == false){

        }*/

        /*while(System.currentTimeMillis() < end) {

        }*/
        /*while (dooropen.getc == 0){

        }*/
        //wait(500);
        //dooropen.stop();
       /// dooropen.setOnRepeat();
       //dooropen.getOnRepeat();
        /*dooropen.stop();

        dooropen.setCycleCount(0);
        dooropen.setCycleCount(2 + door_sound_help);
        door_sound_help++;*/

        //dooropen.stop();
        /*try{
            File sound  = new File("door-open-sound-effect.mp3");
            Clip c  = AudioClip.getClip
        }catch (Exception e){

        }*/
    }


    public void startController(ActionEvent event) throws IOException, URISyntaxException {
        background_music();
        b_start.setVisible(false);
        b_start.setDisable(true);
        b_continue.setDisable(true);
        b_continue.setVisible(false);
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLigvc_Qa2JJzDoqtOr2auuXrPZy7CW0bjbbw2wjdqHgz3df-Du3SqToRbfeOGHKdoZZ0SFT6hbgdDNpc-aIHn_K1lXKBQ3LC9KpRRcjz_ETsjoO_idBY20KFa0zFtBe8iUvAXk3POlGnLgIdZB0TdTs_XqMt9yTKACw8Rb1M2uY_XpjHK6WNXlTamuw/s16000/ata.jpg);");
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiaoUleIr_flTUQiihgbFaf0WjBvgcpp60xH8ZX2OTVCbvDCvkTLRoODdAEIJ9qys-RMgu9NNrhYwd218t4P-Sy6TEDDT3dlYPc34zlWSNOy6snulsGThnr9f8qSbat_wzbEdkGMD6sE56VHeThoVvivE8BVBHkKzXGdsXSAriUsecUk5tmsJkWOCOi/s16000/A.png);");
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg1fiYNSLo6kbFfcW4oayKGYo_h5_6FlqiRTTWQoMztm_J7ZyJTv1TglUB05DXuTj9TzX6ER67GP0Wa2-dsFHOKP3rW59OTOy1JRLACZIUePtXKwYDMUaY0iz6BJXLzCLyZUNUcCf8cf3ommScy68Kw8SnYAjr7NLYZQxnR3alhHPjUXObujeLpqsHA/s16000/Ar.jpg);");
        pane.setStyle("-fx-background-image:url('" + p_A + "')");
        /*Two.setLayoutY(Two.getLayoutY() + 57 * 1);
        Three.setLayoutY(Three.getLayoutY() + 57 * 2);
        Four.setLayoutY(Four.getLayoutY() + 57 * 3);
        Five.setLayoutY(Five.getLayoutY() + 57 * 4);
        Six.setLayoutY(Six.getLayoutY() + 57 * 5);*/
        System.out.println("TEst");
        for(int i = 0; i < 7; i++){
            for(int r = 0; r < 7; r++) {
                System.out.print(Number_phone_C3[i][r]);
            }
            System.out.println("");
        }
        //pane.setStyle("-fx-background-image:url('"+p_a+"')");
        //pane.setStyle("-fx-background-image:url(\"B.png\")");
        //pane.setStyle("-fx-image:url(B.png);");
        //pane.getStylesheets().add(String.valueOf(this.getClass().getResource("B.png")));
        //String www = String.valueOf(Objects.requireNonNull(this.getClass().getResource("B.jpg")).toExternalForm());
        //fff = String.valueOf(getClass().getResource("B.jpg").toURI().toString());
        //pane.setStyle("-fx-background-image:url('"+fff+"')");
        //String eee = "Untitled-Artwork.png";
        //pane.setStyle("-fx-background-image:url('"+eee+"')");
        Thing1_A.setVisible(true);
        A2_close.setVisible(true);
        inventory1.setVisible(true);
        inventory2.setVisible(true);
        inventory3.setVisible(true);
        inventory4.setVisible(true);
        inventory5.setVisible(true);
        inventory6.setVisible(true);
        inventory7.setVisible(true);
        inventory8.setVisible(true);
        inventory9.setVisible(true);
        inventory10.setVisible(true);
        inventory11.setVisible(true);
        inventory12.setVisible(true);
        inventory13.setVisible(true);
        right.setVisible(true);
        left.setVisible(true);
        idoor1.setVisible(true);
        door.setVisible(true);
        A1.setVisible(true);
        A3.setVisible(true);
        A4.setVisible(true);
        A5.setVisible(true);
        data_reset();
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        translate1.setDuration(Duration.millis(300));
        translate2.setDuration(Duration.millis(300));
        translate3.setDuration(Duration.millis(300));
        translate4.setDuration(Duration.millis(300));
        translate5.setDuration(Duration.millis(300));
        translate6.setDuration(Duration.millis(300));
        translate7.setDuration(Duration.millis(300));
        translate8.setDuration(Duration.millis(300));
        translate9.setDuration(Duration.millis(600));
        translate10.setDuration(Duration.millis(600));
        translate9.setByY(-300);
        translate9.setNode(Bb3_door_up);
        translate10.setByY(300);
        translate10.setNode(Bb3_door_down);
        Aa1code_generate();
        /*Aa1_im1.setStyle("-fx-image:url('" + im_Aa1_im1 + "')");
        Aa1_im5.setStyle("-fx-image:url('" + im_Aa1_im2 + "')");
        Aa1_im9.setStyle("-fx-image:url('" + im_Aa1_im3 + "')");
        Aa1_im2.setStyle("-fx-image:url('" + im_Aa1_im1 + "')");
        Aa1_im6.setStyle("-fx-image:url('" + im_Aa1_im2 + "')");
        Aa1_im10.setStyle("-fx-image:url('" + im_Aa1_im3 + "')");
        Aa1_im3.setStyle("-fx-image:url('" + im_Aa1_im1 + "')");
        Aa1_im7.setStyle("-fx-image:url('" + im_Aa1_im2 + "')");
        Aa1_im11.setStyle("-fx-image:url('" + im_Aa1_im3 + "')");
        Aa1_im4.setStyle("-fx-image:url('" + im_Aa1_im1 + "')");
        Aa1_im8.setStyle("-fx-image:url('" + im_Aa1_im2 + "')");
        Aa1_im12.setStyle("-fx-image:url('" + im_Aa1_im3 + "')");*/

        if(Aa1code[0][0] == 1){
            Aa1_im1.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][0] == 2){
            Aa1_im1.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im1.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[0][1] == 1){
            Aa1_im2.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][1] == 2){
            Aa1_im2.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im2.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[0][2] == 1){
            Aa1_im3.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][2] == 2){
            Aa1_im3.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im3.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[0][3] == 1){
            Aa1_im4.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][3] == 2){
            Aa1_im4.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im4.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][0] == 1){
            Aa1_im5.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][0] == 2){
            Aa1_im5.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im5.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][1] == 1){
            Aa1_im6.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][1] == 2){
            Aa1_im6.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im6.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][2] == 1){
            Aa1_im7.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][2] == 2){
            Aa1_im7.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im7.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][3] == 1){
            Aa1_im8.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][3] == 2){
            Aa1_im8.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im8.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][0] == 1){
            Aa1_im9.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][0] == 2){
            Aa1_im9.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im9.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][1] == 1){
            Aa1_im10.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][1] == 2){
            Aa1_im10.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im10.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][2] == 1){
            Aa1_im11.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][2] == 2){
            Aa1_im11.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im11.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][3] == 1){
            Aa1_im12.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][3] == 2){
            Aa1_im12.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            Aa1_im12.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }


        System.out.println(room_index);
        Aa2buttons[0] = 0;
        Aa2buttons[1] = 0;
        Aa2buttons[2] = 0;
        Aa2buttons[3] = 0;
        Aa2code[0] = 1;
        Aa2code[1] = 2;
        Aa2code[2] = 3;
        Aa2code[3] = 4;
        /*Aa1code[0][0] = 1;
        Aa1code[0][1] = 1;
        Aa1code[0][2] = 1;
        Aa1code[0][3] = 1;
        Aa1code[1][0] = 2;
        Aa1code[1][1] = 2;
        Aa1code[1][2] = 2;
        Aa1code[1][3] = 2;
        Aa1code[2][0] = 3;
        Aa1code[2][1] = 3;
        Aa1code[2][2] = 3;
        Aa1code[2][3] = 3;*/
        Aa1answer[0][0] = 3;
        Aa1answer[0][1] = 3;
        Aa1answer[0][2] = 3;
        Aa1answer[0][3] = 3;
        Aa1answer[1][0] = 1;
        Aa1answer[1][1] = 1;
        Aa1answer[1][2] = 1;
        Aa1answer[1][3] = 1;
        Aa1answer[2][0] = 2;
        Aa1answer[2][1] = 2;
        Aa1answer[2][2] = 2;
        Aa1answer[2][3] = 2;
        Bb3_answer[0] = 0;
        Bb3_answer[1] = 2;
        Bb3_answer[2] = 4;
        Bb3_answer[3] = 6;
        Bb3_answer[4] = 7;
        Bb3_answer[5] = 5;
        Bb3_answer[6] = 3;
        Bb3_answer[7] = 1;
        Cc1answer[0][0] = 0;
        Cc1answer[0][1] = 1;
        Cc1answer[0][2] = 2;
        Cc1answer[1][0] = 3;
        Cc1answer[1][1] = 4;
        Cc1answer[1][2] = 5;
        Cc1answer[2][0] = 6;
        Cc1answer[2][1] = 7;
        Cc1answer[2][2] = 8;
        Cc1code[0][0] = 8;
        Cc1code[0][1] = 0;
        Cc1code[0][2] = 1;
        Cc1code[1][0] = 3;
        Cc1code[1][1] = 4;
        Cc1code[1][2] = 2;
        Cc1code[2][0] = 6;
        Cc1code[2][1] = 7;
        Cc1code[2][2] = 5;
        Dd1d1answer[0] = 1;
        Dd1d1answer[1] = 2;
        Dd1d1answer[2] = 3;
        Dd1d1answer[3] = 4;
        E3answer[0] = 1;
        E3answer[1] = 2;
        E3answer[2] = 3;
        E3answer[3] = 4;
        E1answer[0] = 1;
        E1answer[1] = 2;
        E1answer[2] = 3;
        E1answer[3] = 4;
        E1answer[4] = 5;
        F1code[0] = 0;
        F1code[1] = 0;
        F1answer[0] = 7;
        F1answer[1] = 7;
        F2answer[0] = 0;
        F2answer[1] = 2;
        F2answer[2] = 4;
        F2answer[3] = 6;
        G1answer[0] = 0;
        G1answer[1] = 2;
        G1answer[2] = 4;
        G1answer[3] = 6;
        Aa3answer[0] = 0;
        Aa3answer[1] = 1;
        Aa3answer[2] = 2;
        Aa3answer[3] = 3;
        Aa3answer[4] = 4;

        Aa1answer_generate();
        Bb3answer_generate();
        Cc1code_generator();
        Cc3answer_generator();
        Ee1answer_generator();
        One.setLayoutY(One.getLayoutY() + 57 *  C3_answer_help[0][0]);
        Two.setLayoutY(Two.getLayoutY() + 57 * C3_answer_help[0][1]);
        Three.setLayoutY(Three.getLayoutY() + 57 *  C3_answer_help[0][2]);
        Four.setLayoutY(Four.getLayoutY() + 57 *  C3_answer_help[0][3]);
        Five.setLayoutY(Five.getLayoutY() + 57 *  C3_answer_help[0][4]);
        Six.setLayoutY(Six.getLayoutY() + 57 *  C3_answer_help[0][5]);
        One.setLayoutX(One.getLayoutX() + 65 *  C3_answer_help[1][0]);
        Two.setLayoutX(Two.getLayoutX() + 65 * C3_answer_help[1][1]);
        Three.setLayoutX(Three.getLayoutX() + 65 *  C3_answer_help[1][2]);
        Four.setLayoutX(Four.getLayoutX() + 65 *  C3_answer_help[1][3]);
        Five.setLayoutX(Five.getLayoutX() + 65 *  C3_answer_help[1][4]);
        Six.setLayoutX(Six.getLayoutX() + 65 *  C3_answer_help[1][5]);

        if (Cc1code[0][0] == 0) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[0][0] == 1) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[0][0] == 2) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[0][0] == 3) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[0][0] == 4) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[0][0] == 5) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[0][0] == 6) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[0][0] == 7) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b1.setStyle("-fx-background-color: transparent;");
            C1_b1.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[0][1] == 0) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[0][1] == 1) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[0][1] == 2) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[0][1] == 3) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[0][1] == 4) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[0][1] == 5) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[0][1] == 6) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[0][1] == 7) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b2.setStyle("-fx-background-color: transparent;");
            C1_b2.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[0][2] == 0) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[0][2] == 1) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[0][2] == 2) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[0][2] == 3) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[0][2] == 4) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[0][2] == 5) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[0][2] == 6) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[0][2] == 7) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b3.setStyle("-fx-background-color: transparent;");
            C1_b3.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[1][0] == 0) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[1][0] == 1) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[1][0] == 2) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[1][0] == 3) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[1][0] == 4) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[1][0] == 5) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[1][0] == 6) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[1][0] == 7) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b4.setStyle("-fx-background-color: transparent;");
            C1_b4.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[1][1] == 0) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[1][1] == 1) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[1][1] == 2) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[1][1] == 3) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[1][1] == 4) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[1][1] == 5) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[1][1] == 6) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[1][1] == 7) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b5.setStyle("-fx-background-color: transparent;");
            C1_b5.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[1][2] == 0) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[1][2] == 1) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[1][2] == 2) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[1][2] == 3) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[1][2] == 4) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[1][2] == 5) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[1][2] == 6) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[1][2] == 7) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b6.setStyle("-fx-background-color: transparent;");
            C1_b6.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[2][0] == 0) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[2][0] == 1) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[2][0] == 2) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[2][0] == 3) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[2][0] == 4) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[2][0] == 5) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[2][0] == 6) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[2][0] == 7) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b7.setStyle("-fx-background-color: transparent;");
            C1_b7.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[2][1] == 0) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[2][1] == 1) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[2][1] == 2) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[2][1] == 3) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[2][1] == 4) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[2][1] == 5) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[2][1] == 6) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[2][1] == 7) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b8.setStyle("-fx-background-color: transparent;");
            C1_b8.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[2][2] == 0) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[2][2] == 1) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[2][2] == 2) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[2][2] == 3) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[2][2] == 4) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[2][2] == 5) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[2][2] == 6) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[2][2] == 7) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b9.setStyle("-fx-background-color: transparent;");
            C1_b9.setStyle("-fx-background-color: transparent;");
        }

        Dd1d1_b1.setText(String.valueOf(Dd1d1code[0]));
        Dd1d1_b2.setText(String.valueOf(Dd1d1code[1]));
        Dd1d1_b3.setText(String.valueOf(Dd1d1code[2]));
        Dd1d1_b4.setText(String.valueOf(Dd1d1code[3]));
        Ee3_b1.setText(String.valueOf(E3code[0]));
        Ee3_b2.setText(String.valueOf(E3code[1]));
        Ee3_b3.setText(String.valueOf(E3code[2]));
        Ee3_b4.setText(String.valueOf(E3code[3]));
        Aa3_b1.setText("A");
        Aa3_b2.setText("A");
        Aa3_b3.setText("A");
        Aa3_b4.setText("A");
        Aa3_b5.setText("A");
        if(Aa1answer[0][0] == 3){
            Bb3_im_code1.setStyle("-fx-background-color: #a9c52f;");
            B3_im_code1.setStyle("-fx-background-color: #a9c52f;");
        }else if(Aa1answer[0][0] == 2){
            Bb3_im_code1.setStyle("-fx-background-color: #ffc93c;");
            B3_im_code1.setStyle("-fx-background-color: #ffc93c;");
        }else{
            Bb3_im_code1.setStyle("-fx-background-color: #761a1a;");
            B3_im_code1.setStyle("-fx-background-color: #761a1a;");
        }
        if(Aa1answer[1][0] == 3){
            Bb3_im_code2.setStyle("-fx-background-color: #a9c52f;");
            B3_im_code2.setStyle("-fx-background-color: #a9c52f;");
        }else if(Aa1answer[1][0] == 2){
            Bb3_im_code2.setStyle("-fx-background-color: #ffc93c;");
            B3_im_code2.setStyle("-fx-background-color: #ffc93c;");
        }else{
            Bb3_im_code2.setStyle("-fx-background-color: #761a1a;");
            B3_im_code2.setStyle("-fx-background-color: #761a1a;");
        }
        if(Aa1answer[2][0] == 3){
            Bb3_im_code3.setStyle("-fx-background-color: #a9c52f;");
            B3_im_code3.setStyle("-fx-background-color: #a9c52f;");
        }else if(Aa1answer[2][0] == 2){
            Bb3_im_code3.setStyle("-fx-background-color: #ffc93c;");
            B3_im_code3.setStyle("-fx-background-color: #ffc93c;");
        }else{
            Bb3_im_code3.setStyle("-fx-background-color: #761a1a;");
            B3_im_code3.setStyle("-fx-background-color: #761a1a;");
        }
        //Aa1answer_generate();


    }
    public void continueController(ActionEvent event) throws IOException {
        background_music();
        b_start.setVisible(false);
        b_start.setDisable(true);
        b_continue.setDisable(true);
        b_continue.setVisible(false);
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLigvc_Qa2JJzDoqtOr2auuXrPZy7CW0bjbbw2wjdqHgz3df-Du3SqToRbfeOGHKdoZZ0SFT6hbgdDNpc-aIHn_K1lXKBQ3LC9KpRRcjz_ETsjoO_idBY20KFa0zFtBe8iUvAXk3POlGnLgIdZB0TdTs_XqMt9yTKACw8Rb1M2uY_XpjHK6WNXlTamuw/s16000/ata.jpg);");
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiaoUleIr_flTUQiihgbFaf0WjBvgcpp60xH8ZX2OTVCbvDCvkTLRoODdAEIJ9qys-RMgu9NNrhYwd218t4P-Sy6TEDDT3dlYPc34zlWSNOy6snulsGThnr9f8qSbat_wzbEdkGMD6sE56VHeThoVvivE8BVBHkKzXGdsXSAriUsecUk5tmsJkWOCOi/s16000/A.png);");
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg1fiYNSLo6kbFfcW4oayKGYo_h5_6FlqiRTTWQoMztm_J7ZyJTv1TglUB05DXuTj9TzX6ER67GP0Wa2-dsFHOKP3rW59OTOy1JRLACZIUePtXKwYDMUaY0iz6BJXLzCLyZUNUcCf8cf3ommScy68Kw8SnYAjr7NLYZQxnR3alhHPjUXObujeLpqsHA/s16000/Ar.jpg);");
        pane.setStyle("-fx-background-image:url('"+p_A+"')");

        inventory1.setVisible(true);
        inventory2.setVisible(true);
        inventory3.setVisible(true);
        inventory4.setVisible(true);
        inventory5.setVisible(true);
        inventory6.setVisible(true);
        inventory7.setVisible(true);
        inventory8.setVisible(true);
        inventory9.setVisible(true);
        inventory10.setVisible(true);
        inventory11.setVisible(true);
        inventory12.setVisible(true);
        inventory13.setVisible(true);
        door.setVisible(true);
        right.setVisible(true);
        left.setVisible(true);
        data_load();
        F2_b1.setRotate(45*F2code[3]);
        F2_b2.setRotate(45*F2code[2]);
        F2_b3.setRotate(45*F2code[1]);
        F2_b4.setRotate(45*F2code[0]);
        translate1.setDuration(Duration.millis(300));
        translate2.setDuration(Duration.millis(300));
        translate3.setDuration(Duration.millis(300));
        translate4.setDuration(Duration.millis(300));
        translate5.setDuration(Duration.millis(300));
        translate6.setDuration(Duration.millis(300));
        translate7.setDuration(Duration.millis(300));
        translate8.setDuration(Duration.millis(300));
        translate9.setDuration(Duration.millis(600));
        translate10.setDuration(Duration.millis(600));
        translate9.setByY(-300);
        translate9.setNode(Bb3_door_up);
        translate10.setByY(300);
        translate10.setNode(Bb3_door_down);
        if(things[1]==0){
            Thing1_A.setVisible(true);
        }
        if(door1_index == 0) {
            idoor1.setVisible(true);
        }
        if(indexs[1] == 1) {
            A2_open.setVisible(true);
            A2_close.setVisible(true);
            A2_close.setStyle("-fx-background-color: transparent;");
        }
        if(indexs[1] == 0 ) {
            A2_close.setVisible(true);
        }
        if(indexs[3] == 1) {
            A1_open.setVisible(true);
            A1.setVisible(true);
            A1.setStyle("-fx-background-color: transparent;");
        }
        if(indexs[3] == 0 || indexs[3] == 2) {
            A1.setVisible(true);
        }
        if(inventory[0] > 0){
            if(inventory[0] == 1){
                image1.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image1.setVisible(true);
            } else if (inventory[0] == 2) {
                image1.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image1.setVisible(true);
            } else if (inventory[0] == 3) {
                image1.setStyle("-fx-image:url('"+thing1i+"')");
                image1.setVisible(true);
            }
        }
        if(inventory[1] > 0){
            if(inventory[1] == 1){
                image2.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image2.setVisible(true);
            } else if (inventory[1] == 2) {
                image2.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image2.setVisible(true);
            } else if (inventory[1] == 3) {
                image2.setStyle("-fx-image:url('"+thing1i+"')");
                image2.setVisible(true);
            }
        }
        if(inventory[2] > 0){
            if(inventory[2] == 1){
                image3.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image3.setVisible(true);
            } else if (inventory[2] == 2) {
                image3.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image3.setVisible(true);
            } else if (inventory[2] == 3) {
                image3.setStyle("-fx-image:url('"+thing1i+"')");
                image3.setVisible(true);
            }
        }
        b_Aa2_1.setText(String.valueOf(Aa2buttons[0]));
        b_Aa2_2.setText(String.valueOf(Aa2buttons[1]));
        b_Aa2_3.setText(String.valueOf(Aa2buttons[2]));
        b_Aa2_4.setText(String.valueOf(Aa2buttons[3]));
        Dd1d1_b1.setText(String.valueOf(Dd1d1code[0]));
        Dd1d1_b2.setText(String.valueOf(Dd1d1code[1]));
        Dd1d1_b3.setText(String.valueOf(Dd1d1code[2]));
        Dd1d1_b4.setText(String.valueOf(Dd1d1code[3]));
        G1_ring1.setRotate(45*G1code[0]);
        G1_ring2.setRotate(45*G1code[1]);
        G1_ring3.setRotate(45*G1code[2]);
        G1_ring4.setRotate(45*G1code[3]);
        if(Aa1code[0][0] == 1){
            //Aa1_im1.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im1.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][0] == 2){
            //Aa1_im1.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im1.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im1.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im1.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[0][1] == 1){
            //Aa1_im2.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im2.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][1] == 2){
            //Aa1_im2.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im2.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im2.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im2.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[0][2] == 1){
            //Aa1_im3.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im3.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][2] == 2){
            //Aa1_im3.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im3.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im3.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im3.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[0][3] == 1){
            //Aa1_im4.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im4.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[0][3] == 2){
            //Aa1_im4.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im4.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im4.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im4.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][0] == 1){
            //Aa1_im5.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im5.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][0] == 2){
            //Aa1_im5.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im5.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im5.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im5.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][1] == 1){
            //Aa1_im6.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im6.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][1] == 2){
            //Aa1_im6.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im6.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im6.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im6.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][2] == 1){
            //Aa1_im7.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im7.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][2] == 2){
            //Aa1_im7.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im7.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im7.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im7.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[1][3] == 1){
            //Aa1_im8.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im8.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[1][3] == 2){
            //Aa1_im8.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im8.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im8.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im8.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][0] == 1){
            //Aa1_im9.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im9.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][0] == 2){
            //Aa1_im9.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im9.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im9.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im9.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][1] == 1){
            //Aa1_im10.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im10.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][1] == 2){
            //Aa1_im10.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im10.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im10.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im10.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][2] == 1){
            //Aa1_im11.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im11.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][2] == 2){
            //Aa1_im11.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im11.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im11.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im11.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        if(Aa1code[2][3] == 1){
            //Aa1_im12.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhpGhZ86tOC0jZRag61q-V2v9DUGj8aSOALXnynoLQIwpDBSHlpZUzb5AqMIsE2-C7OzVXSAeeVteMshlQUixfwNBXJQuvTvifn_aA6hcSd8qxIMpstP6iQPqL8fh2BE8tcMr4Y5N6RZ4YGshO6esfkIe4IjG9aq8CRtArGvgq3Eqcj2stc03-yUPeP/s1600/A-1.im.1.jpg);");
            Aa1_im12.setStyle("-fx-image:url('"+im_Aa1_im1+"')");
        }else if(Aa1code[2][3] == 2){
            //Aa1_im12.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEie_lU_yNQqbEWfyWNbgYJUuGVdQ4E19_I2BibomE-9Adwfu1ssS0OA1th5ep1HlFr7zKK-_f89TQh5FCEe2I5hBRBdtLmSPfjE2MJ6u36BooxIBeV2QopGOXUAcahaxabEFZCJGvdiApJLADl1e8D34QtpxEvibd2cncLKL3GNm1M6fzZ0BPg-4wRI/s1600/A-1.im.2.jpg);");
            Aa1_im12.setStyle("-fx-image:url('"+im_Aa1_im2+"')");
        }else{
            //Aa1_im12.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLmytN5gsQ30e_fQp-0Ikk09NqvB2W5EVSH-UaG08ODYH_4bbc06BLHJrY0uRUHIq26aNxtgRYbzi-GNOHbPBXH1Vhr56G0UGgfoppoGS7BAnA1sUdMfCyajewKluwXqQIbqASCNuasfqZGmxPPfxULOijVBaAjp5zkxt6jEoZsxIGRYIDhctzaaMd/s1600/A-1.im.3.jpg);");
            Aa1_im12.setStyle("-fx-image:url('"+im_Aa1_im3+"')");
        }
        /*
        if(Cc1code[0][0] == 0){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[0][0] == 1){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[0][0] == 2){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[0][0] == 3){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[0][0] == 4){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[0][0] == 5){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[0][0] == 6){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[0][0] == 7){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b1.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[0][1] == 0){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[0][1] == 1){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[0][1] == 2){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[0][1] == 3){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[0][1] == 4){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[0][1] == 5){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[0][1] == 6){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[0][1] == 7){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b2.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[0][2] == 0){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[0][2] == 1){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[0][2] == 2){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[0][2] == 3){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[0][2] == 4){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[0][2] == 5){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[0][2] == 6){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[0][2] == 7){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b3.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[1][0] == 0){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[1][0] == 1){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[1][0] == 2){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[1][0] == 3){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[1][0] == 4){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[1][0] == 5){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[1][0] == 6){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[1][0] == 7){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b4.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[1][1] == 0){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[1][1] == 1){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[1][1] == 2){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[1][1] == 3){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[1][1] == 4){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[1][1] == 5){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[1][1] == 6){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[1][1] == 7){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b5.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[1][2] == 0){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[1][2] == 1){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[1][2] == 2){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[1][2] == 3){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[1][2] == 4){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[1][2] == 5){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[1][2] == 6){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[1][2] == 7){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b6.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[2][0] == 0){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[2][0] == 1){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[2][0] == 2){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[2][0] == 3){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[2][0] == 4){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[2][0] == 5){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[2][0] == 6){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[2][0] == 7){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b7.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[2][1] == 0){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[2][1] == 1){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[2][1] == 2){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[2][1] == 3){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[2][1] == 4){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[2][1] == 5){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[2][1] == 6){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[2][1] == 7){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b8.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[2][2] == 0){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[2][2] == 1){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[2][2] == 2){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[2][2] == 3){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[2][2] == 4){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[2][2] == 5){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[2][2] == 6){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[2][2] == 7){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b9.setStyle("-fx-background-color: transparent;");
        }*/

        if (Cc1code[0][0] == 0) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[0][0] == 1) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[0][0] == 2) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[0][0] == 3) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[0][0] == 4) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[0][0] == 5) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[0][0] == 6) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[0][0] == 7) {
            C1_b1.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b1.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b1.setStyle("-fx-background-color: transparent;");
            C1_b1.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[0][1] == 0) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[0][1] == 1) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[0][1] == 2) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[0][1] == 3) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[0][1] == 4) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[0][1] == 5) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[0][1] == 6) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[0][1] == 7) {
            C1_b2.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b2.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b2.setStyle("-fx-background-color: transparent;");
            C1_b2.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[0][2] == 0) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[0][2] == 1) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[0][2] == 2) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[0][2] == 3) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[0][2] == 4) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[0][2] == 5) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[0][2] == 6) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[0][2] == 7) {
            C1_b3.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b3.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b3.setStyle("-fx-background-color: transparent;");
            C1_b3.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[1][0] == 0) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[1][0] == 1) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[1][0] == 2) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[1][0] == 3) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[1][0] == 4) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[1][0] == 5) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[1][0] == 6) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[1][0] == 7) {
            C1_b4.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b4.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b4.setStyle("-fx-background-color: transparent;");
            C1_b4.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[1][1] == 0) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[1][1] == 1) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[1][1] == 2) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[1][1] == 3) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[1][1] == 4) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[1][1] == 5) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[1][1] == 6) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[1][1] == 7) {
            C1_b5.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b5.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b5.setStyle("-fx-background-color: transparent;");
            C1_b5.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[1][2] == 0) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[1][2] == 1) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[1][2] == 2) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[1][2] == 3) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[1][2] == 4) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[1][2] == 5) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[1][2] == 6) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[1][2] == 7) {
            C1_b6.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b6.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b6.setStyle("-fx-background-color: transparent;");
            C1_b6.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[2][0] == 0) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[2][0] == 1) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[2][0] == 2) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[2][0] == 3) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[2][0] == 4) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[2][0] == 5) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[2][0] == 6) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[2][0] == 7) {
            C1_b7.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b7.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b7.setStyle("-fx-background-color: transparent;");
            C1_b7.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[2][1] == 0) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[2][1] == 1) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[2][1] == 2) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[2][1] == 3) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[2][1] == 4) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[2][1] == 5) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[2][1] == 6) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[2][1] == 7) {
            C1_b8.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b8.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b8.setStyle("-fx-background-color: transparent;");
            C1_b8.setStyle("-fx-background-color: transparent;");
        }
        if (Cc1code[2][2] == 0) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_1 + "')");
        } else if (Cc1code[2][2] == 1) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_2 + "')");
        } else if (Cc1code[2][2] == 2) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_3 + "')");
        } else if (Cc1code[2][2] == 3) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_4 + "')");
        } else if (Cc1code[2][2] == 4) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_5 + "')");
        } else if (Cc1code[2][2] == 5) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_6 + "')");
        } else if (Cc1code[2][2] == 6) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_7 + "')");
        } else if (Cc1code[2][2] == 7) {
            C1_b9.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
            Cc1_b9.setStyle("-fx-background-image:url('" + im_C_1_8 + "')");
        } else {
            Cc1_b9.setStyle("-fx-background-color: transparent;");
            C1_b9.setStyle("-fx-background-color: transparent;");
        }




        if(indexs[8] == 0) {
            D1.setStyle("-fx-background-image:url('"+im_D1_close+"')");
        }
        if(indexs[8] == 1) {
           D1.setStyle("-fx-background-image:url('"+im_D1_open+"')");
        }
        G1_ring1.setRotate(45*G1code[0]);
        G1_ring2.setRotate(45*G1code[1]);
        G1_ring3.setRotate(45*G1code[2]);
        G1_ring4.setRotate(45*G1code[3]);
        Gg1_b1.setRotate(45*G1code[0]);
        Gg1_b2.setRotate(45*G1code[1]);
        Gg1_b3.setRotate(45*G1code[2]);
        Gg1_b4.setRotate(45*G1code[3]);
        Cc1answer[0][0] = 0;
        Cc1answer[0][1] = 1;
        Cc1answer[0][2] = 2;
        Cc1answer[1][0] = 3;
        Cc1answer[1][1] = 4;
        Cc1answer[1][2] = 5;
        Cc1answer[2][0] = 6;
        Cc1answer[2][1] = 7;
        Cc1answer[2][2] = 8;
        Aa3_b1.setText(String.valueOf((char) (Aa3code[0] + 65)));
        Aa3_b2.setText(String.valueOf((char) (Aa3code[1] + 65)));
        Aa3_b3.setText(String.valueOf((char) (Aa3code[2] + 65)));
        Aa3_b4.setText(String.valueOf((char) (Aa3code[3] + 65)));
        Aa3_b5.setText(String.valueOf((char) (Aa3code[4] + 65)));
        A5.setVisible(true);
        A3.setVisible(true);
        A4.setVisible(true);
        if(indexs[24] == 1) {
            trans_bar_1.setDuration(Duration.millis(800));
            trans_bar_1.setByX(300);
            trans_bar_1.setNode(Aa5_up);
            trans_bar_1.play();
            trans_bar_2.setDuration(Duration.millis(800));
            trans_bar_2.setByX(-300);
            trans_bar_2.setNode(Aa5_down);
            trans_bar_2.play();
            rt.setByAngle(180);
            rt.setDuration(Duration.millis(800));
            rt.setNode(Aa5_wheel);
            rt.play();
        }
        if(indexs[24] == 1){
            A5.setStyle("-fx-background-image:url('"+im_A5_open+"')");
        }
        if(Aa1answer[0][0] == 3){
            Bb3_im_code1.setStyle("-fx-background-color: #a9c52f;");
            B3_im_code1.setStyle("-fx-background-color: #a9c52f;");
        }else if(Aa1answer[0][0] == 2){
            Bb3_im_code1.setStyle("-fx-background-color: #ffc93c;");
            B3_im_code1.setStyle("-fx-background-color: #ffc93c;");
        }else{
            Bb3_im_code1.setStyle("-fx-background-color: #761a1a;");
            B3_im_code1.setStyle("-fx-background-color: #761a1a;");
        }
        if(Aa1answer[1][0] == 3){
            Bb3_im_code2.setStyle("-fx-background-color: #a9c52f;");
            B3_im_code2.setStyle("-fx-background-color: #a9c52f;");
        }else if(Aa1answer[1][0] == 2){
            Bb3_im_code2.setStyle("-fx-background-color: #ffc93c;");
            B3_im_code2.setStyle("-fx-background-color: #ffc93c;");
        }else{
            Bb3_im_code2.setStyle("-fx-background-color: #761a1a;");
            B3_im_code2.setStyle("-fx-background-color: #761a1a;");
        }
        if(Aa1answer[2][0] == 3){
            Bb3_im_code3.setStyle("-fx-background-color: #a9c52f;");
            B3_im_code3.setStyle("-fx-background-color: #a9c52f;");
        }else if(Aa1answer[2][0] == 2){
            Bb3_im_code3.setStyle("-fx-background-color: #ffc93c;");
            B3_im_code3.setStyle("-fx-background-color: #ffc93c;");
        }else{
            Bb3_im_code3.setStyle("-fx-background-color: #761a1a;");
            B3_im_code3.setStyle("-fx-background-color: #761a1a;");
        }
        One.setLayoutY(One.getLayoutY() + 57 *  C3_answer_help[0][0]);
        Two.setLayoutY(Two.getLayoutY() + 57 * C3_answer_help[0][1]);
        Three.setLayoutY(Three.getLayoutY() + 57 *  C3_answer_help[0][2]);
        Four.setLayoutY(Four.getLayoutY() + 57 *  C3_answer_help[0][3]);
        Five.setLayoutY(Five.getLayoutY() + 57 *  C3_answer_help[0][4]);
        Six.setLayoutY(Six.getLayoutY() + 57 *  C3_answer_help[0][5]);
        One.setLayoutX(One.getLayoutX() + 65 *  C3_answer_help[1][0]);
        Two.setLayoutX(Two.getLayoutX() + 65 * C3_answer_help[1][1]);
        Three.setLayoutX(Three.getLayoutX() + 65 *  C3_answer_help[1][2]);
        Four.setLayoutX(Four.getLayoutX() + 65 *  C3_answer_help[1][3]);
        Five.setLayoutX(Five.getLayoutX() + 65 *  C3_answer_help[1][4]);
        Six.setLayoutX(Six.getLayoutX() + 65 *  C3_answer_help[1][5]);

    }







    //A2-start

    public void b_Aa2_1onAction(ActionEvent event) throws IOException {
        Aa2buttons[0] = Aa2buttons[0] + 1;
        if (Aa2buttons[0] ==10){
            Aa2buttons[0] = 0;
        }
        if (Aa2buttons[0] == Aa2code[0]&&Aa2buttons[1] == Aa2code[1]&&Aa2buttons[2] == Aa2code[2]&&Aa2buttons[3] == Aa2code[3]){
            Aa2_close.setVisible(false);
            b_Aa2_1.setVisible(false);
            b_Aa2_2.setVisible(false);
            b_Aa2_3.setVisible(false);
            b_Aa2_4.setVisible(false);
            indexs[2] = 1;
            indexs[1] = 1;
            Aa2_open.setVisible(true);
            //Aa2_open.disabledProperty();
            Aa2_open.setDisable(true);
            //dooropen.play();
            door_music();
            //b_return.setVisible(false);
            //b_return.setVisible(true);
            //b_return.setDepthTest(100,0);
            //b_return.setViewOrder(50);
        }
        b_Aa2_1.setText(String.valueOf(Aa2buttons[0]));
    }
    public void b_Aa2_2onAction(ActionEvent event) throws IOException {
        Aa2buttons[1] = Aa2buttons[1] + 1;
        if (Aa2buttons[1] ==10){
            Aa2buttons[1] = 0;
        }
        if (Aa2buttons[0] == Aa2code[0]&&Aa2buttons[1] == Aa2code[1]&&Aa2buttons[2] == Aa2code[2]&&Aa2buttons[3] == Aa2code[3]){
            Aa2_close.setVisible(false);
            b_Aa2_1.setVisible(false);
            b_Aa2_2.setVisible(false);
            b_Aa2_3.setVisible(false);
            b_Aa2_4.setVisible(false);
            indexs[2] = 1;
            indexs[1] = 1;
            Aa2_open.setVisible(true);
            //dooropen.play();
            door_music();
            //b_return.setVisible(false);
            //b_return.setVisible(true);
        }
        b_Aa2_2.setText(String.valueOf(Aa2buttons[1]));
    }
    public void b_Aa2_3onAction(ActionEvent event) throws IOException {
        Aa2buttons[2] = Aa2buttons[2] + 1;
        if (Aa2buttons[2] ==10){
            Aa2buttons[2] = 0;
        }
        if (Aa2buttons[0] == Aa2code[0]&&Aa2buttons[1] == Aa2code[1]&&Aa2buttons[2] == Aa2code[2]&&Aa2buttons[3] == Aa2code[3]){
            Aa2_close.setVisible(false);
            b_Aa2_1.setVisible(false);
            b_Aa2_2.setVisible(false);
            b_Aa2_3.setVisible(false);
            b_Aa2_4.setVisible(false);
            indexs[2] = 1;
            indexs[1] = 1;
            Aa2_open.setVisible(true);
            //dooropen.play();
            door_music();
            //b_return.setVisible(false);
            //b_return.setVisible(true);
        }
        b_Aa2_3.setText(String.valueOf(Aa2buttons[2]));
    }
    public void b_Aa2_4onAction(ActionEvent event) throws IOException {
        Aa2buttons[3] = Aa2buttons[3] + 1;
        if (Aa2buttons[3] ==10){
            Aa2buttons[3] = 0;
        }
        if (Aa2buttons[0] == Aa2code[0]&&Aa2buttons[1] == Aa2code[1]&&Aa2buttons[2] == Aa2code[2]&&Aa2buttons[3] == Aa2code[3]){
            Aa2_close.setVisible(false);
            b_Aa2_1.setVisible(false);
            b_Aa2_2.setVisible(false);
            b_Aa2_3.setVisible(false);
            b_Aa2_4.setVisible(false);
            indexs[2] = 1;
            indexs[1] = 1;
            Aa2_open.setVisible(true);
            //dooropen.play();
            door_music();
            //clip.play();
            //b_return.setVisible(false);
            //b_return.setVisible(true);
        }
        b_Aa2_4.setText(String.valueOf(Aa2buttons[3]));
    }
    public void A2_close_action(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgDRCAam9iTKOCtKNjQK3U8_djj7ZyTxsh_W7NZRYljqW_UM3d_wNDaJcAXl12_xAZw0SEklHUtYjXhiaNzXTeUM-tEHt2M3fV9QOPbgTUu-XzsTlySpoOuTJScOHKlXE3yE-gnDQC4mdhiQ59TcaA8pSD7kRL3Y4SoN3LY9gZsOLpMHlFD_DkLOmi0/s16000/A-2r.jpg);");
       pane.setStyle("-fx-background-image:url('"+p_A2+"')");
        door.setVisible(false);
        idoor1.setVisible(false);
        A2_close.setVisible(false);
        A2_open.setVisible(false);
        A1_open.setVisible(false);
        A1.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        Thing1_A.setVisible(false);
        //b_return.setVisible(true);
        right.setVisible(false);
        left.setVisible(false);
        if(indexs[2] == 1) {
            Aa2_open.setVisible(true);
            /*Aa2_close.setVisible(true);
            b_Aa2_1.setVisible(true);
            b_Aa2_2.setVisible(true);
            b_Aa2_3.setVisible(true);
            b_Aa2_4.setVisible(true);*/
        }
        if(indexs[2] == 0) {
            Aa2_close.setVisible(true);
            b_Aa2_1.setVisible(true);
            b_Aa2_2.setVisible(true);
            b_Aa2_3.setVisible(true);
            b_Aa2_4.setVisible(true);
        }
        b_return.setVisible(true);
        //A2_close.setVisible(false);
        //A2_open.setVisible(true);
        //indexs [1] = 1;
    }

    public void A2_open_action(ActionEvent event) throws IOException {
        /*A2_open.setVisible(false);
        A2_close.setVisible(true);
        indexs [1] = 0;*/
    }







    //A2 - end

    //A1 - start

    public void A1onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiw4adVCymew4rEIUN1CM1wwtf-JvEpcOBphcecS3Ov4WF-6_Ig45Krb566Wj6CkqNGHht0YEnGLyXYdksFwgsTO5q_HjsJvpXFre6E6DXsKnBFo51DO4vG07Hx1JlMZiaQfX7dZwUZZyWY4nZsL5hODEMCCrSXQcpgmP3jzlDiMY_g9M611N0QLrmB/s16000/A-1r.jpg);");
        pane.setStyle("-fx-background-image:url('"+p_A1+"')");
        //https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgigQiqzH4rlHHXBh7I8IH_dgMeegIHW6O4y4RnMX6qNldjrHMpzCR94mKoxFyF3O_-roTcYu9INL24P3QkDvmKpe6pvqxAS4A5tB7UGwnkFQ7vfzhs7WeNm8vLTgi9robi9ruQYCh8Ot6d4SNgPwkx5XfbuTHiGkRfWI6aFc9NC6R67etr4Gr8VS_g/s16000/A2.close.jpg
        door.setVisible(false);
        idoor1.setVisible(false);
        A2_close.setVisible(false);
        A2_open.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        right.setVisible(false);
        left.setVisible(false);
        A1_open.setVisible(false);
        A1.setVisible(false);
        Thing1_A.setVisible(false);
        if(things[1]==0) {
            Thing1_a.setVisible(true);
        }
        if(indexs[3] == 1) {
            Aa1_open.setVisible(true);
        }
        if(indexs[3] == 0 || indexs[3] == 2 ) {
            Aa1_close.setVisible(true);
            Aa1_im1.setVisible(true);
            Aa1_im2.setVisible(true);
            Aa1_im3.setVisible(true);
            Aa1_im4.setVisible(true);
            Aa1_im5.setVisible(true);
            Aa1_im6.setVisible(true);
            Aa1_im7.setVisible(true);
            Aa1_im8.setVisible(true);
            Aa1_im9.setVisible(true);
            Aa1_im10.setVisible(true);
            Aa1_im11.setVisible(true);
            Aa1_im12.setVisible(true);
            Aa1_b1.setVisible(true);
            Aa1_b2.setVisible(true);
            Aa1_b3.setVisible(true);
            Aa1_b4.setVisible(true);
            Aa1_b5.setVisible(true);
            Aa1_b6.setVisible(true);
            Aa1_b7.setVisible(true);
            Aa1_b8.setVisible(true);
            Aa1_b9.setVisible(true);
            Aa1_b10.setVisible(true);
            Aa1_b11.setVisible(true);
            Aa1_b12.setVisible(true);
            Aa1_b13.setVisible(true);
            Aa1_b14.setVisible(true);
        }
        if(indexs[3] == 2) {
            Aa1_open_b.setVisible(true);
        }
        b_return.setVisible(true);
    }
    public void Aa1_b1onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im1.getStyle());
        Aa1_im1.setStyle(Aa1_im5.getStyle());
        Aa1_im5.setStyle(Aa1_im9.getStyle());
        Aa1_im9.setStyle(i_help.getStyle());
        help_int = Aa1code [0][0];
        Aa1code [0][0] = Aa1code [1][0];
        Aa1code [1][0] = Aa1code [2][0];
        Aa1code [2][0] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
        System.out.println(Aa1code[0][0]);
        System.out.println(Aa1code[1][0]);
        System.out.println(Aa1code[2][0]);
    }
    public void Aa1_b2onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im2.getStyle());
        Aa1_im2.setStyle(Aa1_im6.getStyle());
        Aa1_im6.setStyle(Aa1_im10.getStyle());
        Aa1_im10.setStyle(i_help.getStyle());
        help_int = Aa1code [0][1];
        Aa1code [0][1] = Aa1code [1][1];
        Aa1code [1][1] = Aa1code [2][1];
        Aa1code [2][1] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b3onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im3.getStyle());
        Aa1_im3.setStyle(Aa1_im7.getStyle());
        Aa1_im7.setStyle(Aa1_im11.getStyle());
        Aa1_im11.setStyle(i_help.getStyle());
        help_int = Aa1code [0][2];
        Aa1code [0][2] = Aa1code [1][2];
        Aa1code [1][2] = Aa1code [2][2];
        Aa1code [2][2] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }

    }
    public void Aa1_b4onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im4.getStyle());
        Aa1_im4.setStyle(Aa1_im8.getStyle());
        Aa1_im8.setStyle(Aa1_im12.getStyle());
        Aa1_im12.setStyle(i_help.getStyle());
        help_int = Aa1code [0][3];
        Aa1code [0][3] = Aa1code [1][3];
        Aa1code [1][3] = Aa1code [2][3];
        Aa1code [2][3] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b5onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im4.getStyle());
        Aa1_im4.setStyle(Aa1_im3.getStyle());
        Aa1_im3.setStyle(Aa1_im2.getStyle());
        Aa1_im2.setStyle(Aa1_im1.getStyle());
        Aa1_im1.setStyle(i_help.getStyle());
        help_int = Aa1code [0][3];
        Aa1code [0][3] = Aa1code [0][2];
        Aa1code [0][2] = Aa1code [0][1];
        Aa1code [0][1] = Aa1code [0][0];
        Aa1code [0][0] = help_int;
        System.out.println(Aa1code[0][0]);
        System.out.println(Aa1code[0][1]);
        System.out.println(Aa1code[0][2]);
        System.out.println(Aa1code[0][3]);
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b6onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im8.getStyle());
        Aa1_im8.setStyle(Aa1_im7.getStyle());
        Aa1_im7.setStyle(Aa1_im6.getStyle());
        Aa1_im6.setStyle(Aa1_im5.getStyle());
        Aa1_im5.setStyle(i_help.getStyle());
        help_int = Aa1code [1][3];
        Aa1code [1][3] = Aa1code [1][2];
        Aa1code [1][2] = Aa1code [1][1];
        Aa1code [1][1] = Aa1code [1][0];
        Aa1code [1][0] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b7onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im12.getStyle());
        Aa1_im12.setStyle(Aa1_im11.getStyle());
        Aa1_im11.setStyle(Aa1_im10.getStyle());
        Aa1_im10.setStyle(Aa1_im9.getStyle());
        Aa1_im9.setStyle(i_help.getStyle());
        help_int = Aa1code [2][3];
        Aa1code [2][3] = Aa1code [2][2];
        Aa1code [2][2] = Aa1code [2][1];
        Aa1code [2][1] = Aa1code [2][0];
        Aa1code [2][0] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b8onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im12.getStyle());
        Aa1_im12.setStyle(Aa1_im8.getStyle());
        Aa1_im8.setStyle(Aa1_im4.getStyle());
        Aa1_im4.setStyle(i_help.getStyle());
        help_int = Aa1code [2][3];
        Aa1code [2][3] = Aa1code [1][3];
        Aa1code [1][3] = Aa1code [0][3];
        Aa1code [0][3] = help_int;
        System.out.println(Aa1code[0][3]);
        System.out.println(Aa1code[1][3]);
        System.out.println(Aa1code[2][3]);
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }

    }
    public void Aa1_b9onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im11.getStyle());
        Aa1_im11.setStyle(Aa1_im7.getStyle());
        Aa1_im7.setStyle(Aa1_im3.getStyle());
        Aa1_im3.setStyle(i_help.getStyle());
        help_int = Aa1code [2][2];
        Aa1code [2][2] = Aa1code [1][2];
        Aa1code [1][2] = Aa1code [0][2];
        Aa1code [0][2] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b10onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im10.getStyle());
        Aa1_im10.setStyle(Aa1_im6.getStyle());
        Aa1_im6.setStyle(Aa1_im2.getStyle());
        Aa1_im2.setStyle(i_help.getStyle());
        help_int = Aa1code [2][1];
        Aa1code [2][1] = Aa1code [1][1];
        Aa1code [1][1] = Aa1code [0][1];
        Aa1code [0][1] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b11onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im9.getStyle());
        Aa1_im9.setStyle(Aa1_im5.getStyle());
        Aa1_im5.setStyle(Aa1_im1.getStyle());
        Aa1_im1.setStyle(i_help.getStyle());
        help_int = Aa1code [2][0];
        Aa1code [2][0] = Aa1code [1][0];
        Aa1code [1][0] = Aa1code [0][0];
        Aa1code [0][0] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b12onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im9.getStyle());
        Aa1_im9.setStyle(Aa1_im10.getStyle());
        Aa1_im10.setStyle(Aa1_im11.getStyle());
        Aa1_im11.setStyle(Aa1_im12.getStyle());
        Aa1_im12.setStyle(i_help.getStyle());
        help_int = Aa1code [2][0];
        Aa1code [2][0] = Aa1code [2][1];
        Aa1code [2][1] = Aa1code [2][2];
        Aa1code [2][2] = Aa1code [2][3];
        Aa1code [2][3] = help_int;
        System.out.println(Aa1code[2][0]);
        System.out.println(Aa1code[2][1]);
        System.out.println(Aa1code[2][2]);
        System.out.println(Aa1code[2][3]);
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b13onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im5.getStyle());
        Aa1_im5.setStyle(Aa1_im6.getStyle());
        Aa1_im6.setStyle(Aa1_im7.getStyle());
        Aa1_im7.setStyle(Aa1_im8.getStyle());
        Aa1_im8.setStyle(i_help.getStyle());
        help_int = Aa1code [1][0];
        Aa1code [1][0] = Aa1code [1][1];
        Aa1code [1][1] = Aa1code [1][2];
        Aa1code [1][2] = Aa1code [1][3];
        Aa1code [1][3] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_b14onAction(ActionEvent event) throws IOException {
        i_help.setStyle(Aa1_im1.getStyle());
        Aa1_im1.setStyle(Aa1_im2.getStyle());
        Aa1_im2.setStyle(Aa1_im3.getStyle());
        Aa1_im3.setStyle(Aa1_im4.getStyle());
        Aa1_im4.setStyle(i_help.getStyle());
        help_int = Aa1code [0][0];
        Aa1code [0][0] = Aa1code [0][1];
        Aa1code [0][1] = Aa1code [0][2];
        Aa1code [0][2] = Aa1code [0][3];
        Aa1code [0][3] = help_int;
        Aa1Operation();
        if(Aa1_mismatch == 0){
            Aa1_b1.setDisable(true);
            Aa1_b2.setDisable(true);
            Aa1_b3.setDisable(true);
            Aa1_b4.setDisable(true);
            Aa1_b5.setDisable(true);
            Aa1_b6.setDisable(true);
            Aa1_b7.setDisable(true);
            Aa1_b8.setDisable(true);
            Aa1_b9.setDisable(true);
            Aa1_b10.setDisable(true);
            Aa1_b11.setDisable(true);
            Aa1_b12.setDisable(true);
            Aa1_b13.setDisable(true);
            Aa1_b14.setDisable(true);
            Aa1_open_b.setVisible(true);
        }
    }
    public void Aa1_open_bonAction(ActionEvent event) throws IOException {
            indexs[3] = 1;
        //dooropen.play();
        //clip.play();
        door_music();
        Aa1_open_b.setVisible(false);
        Aa1_b1.setVisible(false);
        Aa1_b2.setVisible(false);
        Aa1_b3.setVisible(false);
        Aa1_b4.setVisible(false);
        Aa1_b5.setVisible(false);
        Aa1_b6.setVisible(false);
        Aa1_b7.setVisible(false);
        Aa1_b8.setVisible(false);
        Aa1_b9.setVisible(false);
        Aa1_b10.setVisible(false);
        Aa1_b11.setVisible(false);
        Aa1_b12.setVisible(false);
        Aa1_b13.setVisible(false);
        Aa1_b14.setVisible(false);
        Aa1_open.setVisible(true);
        Aa1_close.setVisible(false);
        Aa1_im1.setVisible(false);
        Aa1_im2.setVisible(false);
        Aa1_im3.setVisible(false);
        Aa1_im4.setVisible(false);
        Aa1_im5.setVisible(false);
        Aa1_im6.setVisible(false);
        Aa1_im7.setVisible(false);
        Aa1_im8.setVisible(false);
        Aa1_im9.setVisible(false);
        Aa1_im10.setVisible(false);
        Aa1_im11.setVisible(false);
        Aa1_im12.setVisible(false);
    }
    public void A3onAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url('" + p_A3 + "')");
        door.setVisible(false);
        idoor1.setVisible(false);
        A2_close.setVisible(false);
        A2_open.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A_door_open.setVisible(false);
        right.setVisible(false);
        left.setVisible(false);
        A1_open.setVisible(false);
        A1.setVisible(false);
        b_return.setVisible(true);
        Aa3_b1.setVisible(true);
        Aa3_b2.setVisible(true);
        Aa3_b3.setVisible(true);
        Aa3_b4.setVisible(true);
        Aa3_b5.setVisible(true);
        Thing1_A.setVisible(false);
    }
    public void A3_b1onAction(ActionEvent event) throws IOException {
            if(indexs[23] == 0) {
                Aa3code[0] = Aa3code[0] + 1;
                if (Aa3code[0] == 26) {
                    Aa3code[0] = 0;
                }
                if (Aa3code[0] == Aa3answer[0] && Aa3code[1] == Aa3answer[1] && Aa3code[2] == Aa3answer[2] && Aa3code[3] == Aa3answer[3] && Aa3code[4] == Aa3answer[4]) {
            /*Aa3_b1.setVisible(false);
            Aa3_b2.setVisible(false);
            Aa3_b3.setVisible(false);
            Aa3_b4.setVisible(false);
            Aa3_b5.setVisible(false);*/
                    indexs[23] = 1;
                    door_music();
                }
                char q = (char) (Aa3code[0] + 65);
                Aa3_b1.setText(String.valueOf(q));
            }
    }
    public void A3_b2onAction(ActionEvent event) throws IOException {
        if(indexs[23] == 0) {
            Aa3code[1] = Aa3code[1] + 1;
            if (Aa3code[1] == 26) {
                Aa3code[1] = 0;
            }
            if (Aa3code[0] == Aa3answer[0] && Aa3code[1] == Aa3answer[1] && Aa3code[2] == Aa3answer[2] && Aa3code[3] == Aa3answer[3] && Aa3code[4] == Aa3answer[4]) {
                /*Aa3_b1.setVisible(false);
                Aa3_b2.setVisible(false);
                Aa3_b3.setVisible(false);
                Aa3_b4.setVisible(false);
                Aa3_b5.setVisible(false);*/
                indexs[23] = 1;
                door_music();
            }
            char q = (char) (Aa3code[1] + 65);
            Aa3_b2.setText(String.valueOf(q));
        }
    }
    public void A3_b3onAction(ActionEvent event) throws IOException {
        if(indexs[23] == 0) {
            Aa3code[2] = Aa3code[2] + 1;
            if (Aa3code[2] == 26) {
                Aa3code[2] = 0;
            }
            if (Aa3code[0] == Aa3answer[0] && Aa3code[1] == Aa3answer[1] && Aa3code[2] == Aa3answer[2] && Aa3code[3] == Aa3answer[3] && Aa3code[4] == Aa3answer[4]) {
                /*Aa3_b1.setVisible(false);
                Aa3_b2.setVisible(false);
                Aa3_b3.setVisible(false);
                Aa3_b4.setVisible(false);
                Aa3_b5.setVisible(false);*/
                indexs[23] = 1;
                door_music();
            }
            char q = (char) (Aa3code[2] + 65);
            Aa3_b3.setText(String.valueOf(q));
        }
    }
    public void A3_b4onAction(ActionEvent event) throws IOException {
        if(indexs[23] == 0) {
            Aa3code[3] = Aa3code[3] + 1;
            if (Aa3code[3] == 26) {
                Aa3code[3] = 0;
            }
            if (Aa3code[3] == Aa3answer[0] && Aa3code[1] == Aa3answer[1] && Aa3code[2] == Aa3answer[2] && Aa3code[3] == Aa3answer[3] && Aa3code[4] == Aa3answer[4]) {
                /*Aa3_b1.setVisible(false);
                Aa3_b2.setVisible(false);
                Aa3_b3.setVisible(false);
                Aa3_b4.setVisible(false);
                Aa3_b5.setVisible(false);*/
                indexs[23] = 1;
                door_music();
            }
            char q = (char) (Aa3code[3] + 65);
            Aa3_b4.setText(String.valueOf(q));
        }
    }
    public void A3_b5onAction(ActionEvent event) throws IOException {
        if(indexs[23] == 0) {
            Aa3code[4] = Aa3code[4] + 1;
            if (Aa3code[4] == 26) {
                Aa3code[4] = 0;
            }
            if (Aa3code[0] == Aa3answer[0] && Aa3code[1] == Aa3answer[1] && Aa3code[2] == Aa3answer[2] && Aa3code[3] == Aa3answer[3] && Aa3code[4] == Aa3answer[4]) {
                /*Aa3_b1.setVisible(false);
                Aa3_b2.setVisible(false);
                Aa3_b3.setVisible(false);
                Aa3_b4.setVisible(false);
                Aa3_b5.setVisible(false);*/
                indexs[23] = 1;
                door_music();
            }
            char q = (char) (Aa3code[4] + 65);
            Aa3_b5.setText(String.valueOf(q));
        }
    }
    public void A4onAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url('" + p_A4 + "')");
        door.setVisible(false);
        idoor1.setVisible(false);
        A2_close.setVisible(false);
        A2_open.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A_door_open.setVisible(false);
        right.setVisible(false);
        left.setVisible(false);
        A1_open.setVisible(false);
        A1.setVisible(false);
        b_return.setVisible(true);
        Aa4_b.setVisible(true);
        Thing1_A.setVisible(false);
        //Aa4_card.setVisible(true);
    }
    public void Aa4_bonAction(ActionEvent event) throws IOException {
        if(indexs[25] == 0) {
            Aa4_card.setVisible(true);
            ft.setDuration(Duration.millis(2000));
            ft.setNode(Aa4_card);
            ft.setFromValue(1.0);
            ft.setToValue(0.0);
            ft.play();
            trans_bar_3.setDuration(Duration.millis(1000));
            trans_bar_3.setByY(550);
            trans_bar_3.setNode(Aa4_card);
            trans_bar_3.play();
            indexs[25] =1;
        }
    }
    public void A5onAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url('" + p_A5 + "')");
        door.setVisible(false);
        idoor1.setVisible(false);
        A2_close.setVisible(false);
        A2_open.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A_door_open.setVisible(false);
        right.setVisible(false);
        left.setVisible(false);
        A1_open.setVisible(false);
        A1.setVisible(false);
        b_return.setVisible(true);
        Aa5_down.setVisible(true);
        Aa5_up.setVisible(true);
        Aa5_wheel.setVisible(true);
        Thing1_A.setVisible(false);
    }
    public void Aa5_wheelonAction(ActionEvent event) throws IOException {
        if(indexs[24] == 0) {
            trans_bar_1.setDuration(Duration.millis(800));
            trans_bar_1.setByX(300);
            trans_bar_1.setNode(Aa5_up);
            trans_bar_1.play();
            trans_bar_2.setDuration(Duration.millis(800));
            trans_bar_2.setByX(-300);
            trans_bar_2.setNode(Aa5_down);
            trans_bar_2.play();
            rt.setByAngle(180);
            rt.setDuration(Duration.millis(800));
            rt.setNode(Aa5_wheel);
            rt.play();
            indexs[24] = 1;
        }
    }













    public void B1onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi7SkzQcUhehkzgxM7e9Dw6YGLrryTzLJrXTaee5OoZQHLhcGjAT8bBOsaTQmQhOfHsQqLw6PJu93Tx__91DbKXONcSrS8Bwi8eG6FPqbIwJc2-_PzZgZSPY4kmPNtUWGMJcwYCg4_q1KzD_oXr-_aiM-AN39PUyC6H3iJXRerWq_zpq5r8-GnErZCO/s16000/B-1r.jpg);");
        pane.setStyle("-fx-background-image:url('"+p_B1+"')");
        b_return.setVisible(true);
        right.setVisible(false);
        left.setVisible(false);
        door_key2.setVisible(false);
        B1a_close.setVisible(false);
        B1b_close.setVisible(false);
        B1a_open.setVisible(false);
        B1b_open.setVisible(false);
        B1a_open.setVisible(false);
        B1b_open.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        B3_im_code1.setVisible(false);
        B3_im_code2.setVisible(false);
        B3_im_code3.setVisible(false);
        Number_code_room_B.setVisible(false);
        if(indexs[4] == 0){
            Bb1a_close.setVisible(true);
        }
        if(indexs[4] == 1){
            Bb1a_open.setVisible(true);
        }
        if(indexs[5] == 0){
            Bb1b_close.setVisible(true);
        }
        if(indexs[5] == 1){
            Bb1b_open.setVisible(true);
        }
    }
    public void Bb1a_openonAction(ActionEvent event) throws IOException {
        B1a_open.setVisible(false);
        B1a_close.setVisible(false);
        B1b_open.setVisible(false);
        B1b_close.setVisible(false);
        door_music();
            indexs[4] = 0;
            Bb1a_open.setVisible(false);
        //B1a_close.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZmWabbdLnlhBn3lq8mM_XLoa5rM6LIttd-KDw6Q78x3Q6tm9NL3tw6kn402zJepzgp2UJXtd5Iht8wHXDGYxeXx_NOvi-xqwK-pdiL6yHQ2cAFGc-8vppEhC55B0Z4em76-2dCDSYH3Z35JWQiLaz-7nBuh5kb1ADB9pk__9d7FI9PGd9G2BnasRE/s1600/B1a.close.jpg);");
        B1a_close.setStyle("-fx-background-image:url('"+im_B1a_close+"')");
        Bb1a_close.setVisible(true);
    }
    public void Bb1b_openonAction(ActionEvent event) throws IOException {
        B1a_open.setVisible(false);
        door_music();
        B1a_close.setVisible(false);
        B1b_open.setVisible(false);
        B1b_close.setVisible(false);
        indexs[5] = 0;
        //B1b_close.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjHfNur9-0sCwU0DKhB8yiEBlhUuKIZQrqm-ITKZLzQcRQAYUDu9dkS79hTOyHIOK2qHL65nJdLkZrF2naYffE6sEBAjor4CQoR00plLAmDa4HYzyP_od4E0Pak0EuVl1-BLv1aCZKGXUsqReGin2oqleY7Saq3rFqej8-3RAfxo_chgWU1CdL-EOfV/s1600/B1b.close.jpg);");
        B1b_close.setStyle("-fx-background-image:url('"+im_B1b_close+"')");
        Bb1b_open.setVisible(false);
        Bb1b_close.setVisible(true);
    }
    public void Bb1a_closeonAction(ActionEvent event) throws IOException {
        B1a_open.setVisible(false);
        door_music();
        B1a_close.setVisible(false);
        B1b_open.setVisible(false);
        B1b_close.setVisible(false);
        indexs[4] = 1;
        Bb1a_close.setVisible(false);
        Bb1a_open.setVisible(true);
    }
    public void Bb1b_closeonAction(ActionEvent event) throws IOException {
        B1a_open.setVisible(false);
        door_music();
        B1a_close.setVisible(false);
        B1b_open.setVisible(false);
        B1b_close.setVisible(false);
        indexs[5] = 1;
        Bb1b_close.setVisible(false);
        Bb1b_open.setVisible(true);
    }





    public void B2onAction(ActionEvent event) throws IOException {
       // pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjkVVyzC-H3AVJH3uaSOU11KT6wVBuTzHMOsbjUfETZA9bmxFg_QGLr6294OGcIYG_18DAHDqzsd9uzB32hWrxdGwhVh0J9CI4D2cIZnPXUNPJSWDmKRm7tNZgVlnOEgVPTpIh977JQZIsHB2SiJwknji_YSoXPZMjS3PJlk-JZWp9s9O-aN5NLSypc/s16000/B-2.png);");
        pane.setStyle("-fx-background-image:url('"+p_B2+"')");
        b_return.setVisible(true);
        right.setVisible(false);
        left.setVisible(false);
        door_key2.setVisible(false);
        B1a_close.setVisible(false);
        B1b_close.setVisible(false);
        B1a_open.setVisible(false);
        B1b_open.setVisible(false);
        B1a_open.setVisible(false);
        B1b_open.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        B3_im_code1.setVisible(false);
        B3_im_code2.setVisible(false);
        B3_im_code3.setVisible(false);
        Number_code_room_B.setVisible(false);
    }




    public void B3onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh3LFN0ARNc09Bcfu5_kwPuvNNxKw-Tw73xxtKyFxMxUFvvPNLFUZZ2Tz7MrxRpECKfVDRaP6b-c4ln-sUDqF5v9yGa_EogSGFWYfG1vF8Z1lxxx2YEgidmbUvkTnHGN8g_z9pkaXurRA9PmpxxxIBE3tkSQXJ7RkRWk8gf3qpWRwWVGIR_vxqOLfG_/s16000/B-3r.jpg);");
        pane.setStyle("-fx-background-image:url('"+p_B3+"')");
        b_return.setVisible(true);
        Bb3_back.setVisible(true);
        if(indexs[6] == 0) {
            Bb3_door_up.setVisible(true);
            Bb3_door_down.setVisible(true);
            Bb3_im1_down.setVisible(true);
            Bb3_im2_down.setVisible(true);
            Bb3_im3_down.setVisible(true);
            Bb3_im4_down.setVisible(true);
            Bb3_im1_up.setVisible(true);
            Bb3_im2_up.setVisible(true);
            Bb3_im3_up.setVisible(true);
            Bb3_im4_up.setVisible(true);
            Bb3_b1.setVisible(true);
            Bb3_b2.setVisible(true);
            Bb3_b3.setVisible(true);
            Bb3_b4.setVisible(true);
            Bb3_b5.setVisible(true);
            Bb3_b6.setVisible(true);
            Bb3_b7.setVisible(true);
            Bb3_b8.setVisible(true);
            B3_im_code1.setVisible(false);
            B3_im_code2.setVisible(false);
            B3_im_code3.setVisible(false);
            Number_code_room_B.setVisible(false);
        }
        if(indexs[6] == 1) {

        }
        right.setVisible(false);
        left.setVisible(false);
        door_key2.setVisible(false);
        B1a_close.setVisible(false);
        B1b_close.setVisible(false);
        B1a_open.setVisible(false);
        B1b_open.setVisible(false);
        B1a_open.setVisible(false);
        B1b_open.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        Bb3_im_code1.setVisible(true);
        Bb3_im_code2.setVisible(true);
        Bb3_im_code3.setVisible(true);
        B3_im_code1.setVisible(false);
        B3_im_code2.setVisible(false);
        B3_im_code3.setVisible(false);
        }

    public void Bb3_b1onAction(ActionEvent event) throws IOException, InterruptedException {
        if (Bb3_press[0] == 0) {

            translate1.setByY(-300);
            translate1.setNode(Bb3_im1_up);

            //translate1.play();
            Bb3_press[0] = Bb3_press[0] + 1;
            //translate1.setAutoReverse(false);
            if (Bb3_count == Bb3_answer[0]) {
                Bb3_count = Bb3_count + 1;
                translate1.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[0] = Bb3_press[0] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[1]< Bb3_count){
                    Bb3_press[1] = 0;
                    translate2.setByY(300);
                    translate2.play();
                }
                if(Bb3_answer[2]< Bb3_count){
                    Bb3_press[2] = 0;
                    translate3.setByY(300);
                    translate3.play();
                }
                if(Bb3_answer[3]< Bb3_count){
                    Bb3_press[3] = 0;
                    translate4.setByY(300);
                    translate4.play();
                }
                if(Bb3_answer[4]< Bb3_count){
                    Bb3_press[4] = 0;
                    translate5.setByY(-300);
                    translate5.play();
                }
                if(Bb3_answer[5]< Bb3_count){
                    Bb3_press[5] = 0;
                    translate6.setByY(-300);
                    translate6.play();
                }
                if(Bb3_answer[6]< Bb3_count){
                    Bb3_press[6] = 0;
                    translate7.setByY(-300);
                    translate7.play();
                }
                if(Bb3_answer[7]< Bb3_count){
                    Bb3_press[7] = 0;
                    translate8.setByY(-300);
                    translate8.play();
                }
                Bb3_count = 0;
                Bb3_press[0] = 0;
                //wait(100);
                //translate1.setAutoReverse(true);
                //translate1.stop();


                    //translate1.setByY(300);
                    //translate1.setNode(Bb3_im1_up);
                    //translate1.play();
            }
        }

    }
    public void Bb3_b2onAction(ActionEvent event) throws IOException {
        if (Bb3_press[1]==0) {
            translate2.setByY(-300);
            translate2.setNode(Bb3_im2_up);
            //translate2.play();
            Bb3_press[1] = Bb3_press[1] +1;
            if (Bb3_count == Bb3_answer[1]) {
                Bb3_count = Bb3_count + 1;
                translate2.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[1] = Bb3_press[1] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[0]< Bb3_count){
                    Bb3_press[0] = 0;
                    translate1.setByY(300);
                    translate1.play();
                }
                if(Bb3_answer[2]< Bb3_count){
                    Bb3_press[2] = 0;
                    translate3.setByY(300);
                    translate3.play();
                }
                if(Bb3_answer[3]< Bb3_count){
                    Bb3_press[3] = 0;
                    translate4.setByY(300);
                    translate4.play();
                }
                if(Bb3_answer[4]< Bb3_count){
                    Bb3_press[4] = 0;
                    translate5.setByY(-300);
                    translate5.play();
                }
                if(Bb3_answer[5]< Bb3_count){
                    Bb3_press[5] = 0;
                    translate6.setByY(-300);
                    translate6.play();
                }
                if(Bb3_answer[6]< Bb3_count){
                    Bb3_press[6] = 0;
                    translate7.setByY(-300);
                    translate7.play();
                }
                if(Bb3_answer[7]< Bb3_count){
                    Bb3_press[7] = 0;
                    translate8.setByY(-300);
                    translate8.play();
                }
                Bb3_count = 0;
            }
        }
    }
    public void Bb3_b3onAction(ActionEvent event) throws IOException {
        if (Bb3_press[2]==0) {
            translate3.setByY(-300);
            translate3.setNode(Bb3_im3_up);
            //translate3.play();
            Bb3_press[2] = Bb3_press[2] +1;
            //Bb3_press[1] = Bb3_press[1] +1;
            if (Bb3_count == Bb3_answer[2]) {
                Bb3_count = Bb3_count + 1;
                translate3.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[2] = Bb3_press[2] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[0]< Bb3_count){
                    Bb3_press[0] = 0;
                    translate1.setByY(300);
                    translate1.play();
                }
                if(Bb3_answer[1]< Bb3_count){
                    Bb3_press[1] = 0;
                    translate2.setByY(300);
                    translate2.play();
                }
                if(Bb3_answer[3]< Bb3_count){
                    Bb3_press[3] = 0;
                    translate4.setByY(300);
                    translate4.play();
                }
                if(Bb3_answer[4]< Bb3_count){
                    Bb3_press[4] = 0;
                    translate5.setByY(-300);
                    translate5.play();
                }
                if(Bb3_answer[5]< Bb3_count){
                    Bb3_press[5] = 0;
                    translate6.setByY(-300);
                    translate6.play();
                }
                if(Bb3_answer[6]< Bb3_count){
                    Bb3_press[6] = 0;
                    translate7.setByY(-300);
                    translate7.play();
                }
                if(Bb3_answer[7]< Bb3_count){
                    Bb3_press[7] = 0;
                    translate8.setByY(-300);
                    translate8.play();
                }
                Bb3_count = 0;
            }
        }
    }
    public void Bb3_b4onAction(ActionEvent event) throws IOException {
        if (Bb3_press[3]==0) {

            translate4.setByY(-300);
            translate4.setNode(Bb3_im4_up);
            //translate4.play();
            Bb3_press[3] = Bb3_press[3] +1;
            if (Bb3_count == Bb3_answer[3]) {
                Bb3_count = Bb3_count + 1;
                translate4.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[3] = Bb3_press[3] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[0]< Bb3_count){
                    Bb3_press[0] = 0;
                    translate1.setByY(300);
                    translate1.play();
                }
                if(Bb3_answer[1]< Bb3_count){
                    Bb3_press[1] = 0;
                    translate2.setByY(300);
                    translate2.play();
                }
                if(Bb3_answer[2]< Bb3_count){
                    Bb3_press[2] = 0;
                    translate3.setByY(300);
                    translate3.play();
                }
                if(Bb3_answer[4]< Bb3_count){
                    Bb3_press[4] = 0;
                    translate5.setByY(-300);
                    translate5.play();
                }
                if(Bb3_answer[5]< Bb3_count){
                    Bb3_press[5] = 0;
                    translate6.setByY(-300);
                    translate6.play();
                }
                if(Bb3_answer[6]< Bb3_count){
                    Bb3_press[6] = 0;
                    translate7.setByY(-300);
                    translate7.play();
                }
                if(Bb3_answer[7]< Bb3_count){
                    Bb3_press[7] = 0;
                    translate8.setByY(-300);
                    translate8.play();
                }
                Bb3_count = 0;
            }
        }
    }
    public void Bb3_b5onAction(ActionEvent event) throws IOException {
        if (Bb3_press[4]==0) {
            translate5.setByY(300);
            translate5.setNode(Bb3_im1_down);
            //translate5.play();
            Bb3_press[4] = Bb3_press[4] +1;
            if (Bb3_count == Bb3_answer[4]) {
                Bb3_count = Bb3_count + 1;
                translate5.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[4] = Bb3_press[4] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[0]< Bb3_count){
                    Bb3_press[0] = 0;
                    translate1.setByY(300);
                    translate1.play();
                }
                if(Bb3_answer[1]< Bb3_count){
                    Bb3_press[1] = 0;
                    translate2.setByY(300);
                    translate2.play();
                }
                if(Bb3_answer[2]< Bb3_count){
                    Bb3_press[2] = 0;
                    translate3.setByY(300);
                    translate3.play();
                }
                if(Bb3_answer[3]< Bb3_count){
                    Bb3_press[3] = 0;
                    translate4.setByY(300);
                    translate4.play();
                }
                if(Bb3_answer[5]< Bb3_count){
                    Bb3_press[5] = 0;
                    translate6.setByY(-300);
                    translate6.play();
                }
                if(Bb3_answer[6]< Bb3_count){
                    Bb3_press[6] = 0;
                    translate7.setByY(-300);
                    translate7.play();
                }
                if(Bb3_answer[7]< Bb3_count){
                    Bb3_press[7] = 0;
                    translate8.setByY(-300);
                    translate8.play();
                }
                Bb3_count = 0;
            }
        }
    }
    public void Bb3_b6onAction(ActionEvent event) throws IOException {
        if (Bb3_press[5]==0) {
            translate6.setByY(300);
            translate6.setNode(Bb3_im2_down);
            //translate6.play();
            Bb3_press[5] = Bb3_press[5] +1;
            if (Bb3_count == Bb3_answer[5]) {
                Bb3_count = Bb3_count + 1;
                translate6.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[5] = Bb3_press[5] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[0]< Bb3_count){
                    Bb3_press[0] = 0;
                    translate1.setByY(300);
                    translate1.play();
                }
                if(Bb3_answer[1]< Bb3_count){
                    Bb3_press[1] = 0;
                    translate2.setByY(300);
                    translate2.play();
                }
                if(Bb3_answer[2]< Bb3_count){
                    Bb3_press[2] = 0;
                    translate3.setByY(300);
                    translate3.play();
                }
                if(Bb3_answer[3]< Bb3_count){
                    Bb3_press[3] = 0;
                    translate4.setByY(300);
                    translate4.play();
                }
                if(Bb3_answer[4]< Bb3_count){
                    Bb3_press[4] = 0;
                    translate5.setByY(-300);
                    translate5.play();
                }
                if(Bb3_answer[6]< Bb3_count){
                    Bb3_press[6] = 0;
                    translate7.setByY(-300);
                    translate7.play();
                }
                if(Bb3_answer[7]< Bb3_count){
                    Bb3_press[7] = 0;
                    translate8.setByY(-300);
                    translate8.play();
                }
                Bb3_count = 0;
            }
        }
    }
    public void Bb3_b7onAction(ActionEvent event) throws IOException {
        if (Bb3_press[6]==0) {
            translate7.setByY(300);
            translate7.setNode(Bb3_im3_down);
            //translate7.play();
            Bb3_press[6] = Bb3_press[6] +1;
            if (Bb3_count == Bb3_answer[6]) {
                Bb3_count = Bb3_count + 1;
                translate7.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[6] = Bb3_press[6] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[0]< Bb3_count){
                    Bb3_press[0] = 0;
                    translate1.setByY(300);
                    translate1.play();
                }
                if(Bb3_answer[1]< Bb3_count){
                    Bb3_press[1] = 0;
                    translate2.setByY(300);
                    translate2.play();
                }
                if(Bb3_answer[2]< Bb3_count){
                    Bb3_press[2] = 0;
                    translate3.setByY(300);
                    translate3.play();
                }
                if(Bb3_answer[3]< Bb3_count){
                    Bb3_press[3] = 0;
                    translate4.setByY(300);
                    translate4.play();
                }
                if(Bb3_answer[4]< Bb3_count){
                    Bb3_press[4] = 0;
                    translate5.setByY(-300);
                    translate5.play();
                }
                if(Bb3_answer[5]< Bb3_count){
                    Bb3_press[5] = 0;
                    translate6.setByY(-300);
                    translate6.play();
                }
                if(Bb3_answer[7]< Bb3_count){
                    Bb3_press[7] = 0;
                    translate8.setByY(-300);
                    translate8.play();
                }
                Bb3_count = 0;
            }
        }
    }
    public void Bb3_b8onAction(ActionEvent event) throws IOException {
        if (Bb3_press[7]==0) {
            translate8.setByY(300);
            translate8.setNode(Bb3_im4_down);
            //translate8.play();
            Bb3_press[7] = Bb3_press[7] +1;
            if (Bb3_count == Bb3_answer[7]) {
                Bb3_count = Bb3_count + 1;
                translate8.play();
                if(Bb3_count == 8 ){
                    translate10.play();
                    translate9.play();
                    indexs[6] = 1;
                }
            } else {
                Bb3_press[7] = Bb3_press[7] - 1;
                System.out.println("dsdsadsadasdsaasdasf");
                if(Bb3_answer[0]< Bb3_count){
                    Bb3_press[0] = 0;
                    translate1.setByY(300);
                    translate1.play();
                }
                if(Bb3_answer[1]< Bb3_count){
                    Bb3_press[1] = 0;
                    translate2.setByY(300);
                    translate2.play();
                }
                if(Bb3_answer[2]< Bb3_count){
                    Bb3_press[2] = 0;
                    translate3.setByY(300);
                    translate3.play();
                }
                if(Bb3_answer[3]< Bb3_count){
                    Bb3_press[3] = 0;
                    translate4.setByY(300);
                    translate4.play();
                }
                if(Bb3_answer[4]< Bb3_count){
                    Bb3_press[4] = 0;
                    translate5.setByY(-300);
                    translate5.play();
                }
                if(Bb3_answer[5]< Bb3_count){
                    Bb3_press[5] = 0;
                    translate6.setByY(-300);
                    translate6.play();
                }
                if(Bb3_answer[6]< Bb3_count){
                    Bb3_press[6] = 0;
                    translate7.setByY(-300);
                    translate7.play();
                }
                Bb3_count = 0;
            }
        }
    }






    public void C1onAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhB5DN6cgWpIfE0o_z_q3ndqL-QROpY6xNQOijpD0eBUiHkUDGUj7_0RUXy3H9_ZBJjraYY6zVkeU2ZbWjD8Ngjr-ON_XxMpYfH-QSU0j9Y9PrjfdKDxWeuipD34ZR4Zoc1btsUIEmG4x4otvrSsaLUbfZnT5813XV03UVDRQTn4Rj7aJ2iZj0v-epL/s16000/C-1r.jpg);");
        pane.setStyle("-fx-background-image:url('" + p_C1 + "')");
        b_return.setVisible(true);
        door_key1.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        C1_b1.setVisible(false);
        C1_b2.setVisible(false);
        C1_b3.setVisible(false);
        C1_b4.setVisible(false);
        C1_b5.setVisible(false);
        C1_b6.setVisible(false);
        C1_b7.setVisible(false);
        C1_b8.setVisible(false);
        C1_b9.setVisible(false);
        C1_door.setVisible(false);
        Cc1_b1.setVisible(true);
        Cc1_b2.setVisible(true);
        Cc1_b3.setVisible(true);
        Cc1_b4.setVisible(true);
        Cc1_b5.setVisible(true);
        Cc1_b6.setVisible(true);
        Cc1_b7.setVisible(true);
        Cc1_b8.setVisible(true);
        Cc1_b9.setVisible(true);
        C3.setVisible(false);
        C2.setVisible(false);
        C4.setVisible(false);
        C_door.setVisible(false);
        C_door_open.setVisible(false);
        /*if(Cc1code[0][0] == 0){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[0][0] == 1){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[0][0] == 2){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[0][0] == 3){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[0][0] == 4){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[0][0] == 5){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[0][0] == 6){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[0][0] == 7){
            Cc1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b1.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[0][1] == 0){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[0][1] == 1){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[0][1] == 2){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[0][1] == 3){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[0][1] == 4){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[0][1] == 5){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[0][1] == 6){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[0][1] == 7){
            Cc1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b2.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[0][2] == 0){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[0][2] == 1){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[0][2] == 2){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[0][2] == 3){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[0][2] == 4){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[0][2] == 5){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[0][2] == 6){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[0][2] == 7){
            Cc1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b3.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[1][0] == 0){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[1][0] == 1){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[1][0] == 2){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[1][0] == 3){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[1][0] == 4){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[1][0] == 5){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[1][0] == 6){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[1][0] == 7){
            Cc1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b4.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[1][1] == 0){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[1][1] == 1){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[1][1] == 2){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[1][1] == 3){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[1][1] == 4){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[1][1] == 5){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[1][1] == 6){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[1][1] == 7){
            Cc1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b5.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[1][2] == 0){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[1][2] == 1){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[1][2] == 2){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[1][2] == 3){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[1][2] == 4){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[1][2] == 5){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[1][2] == 6){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[1][2] == 7){
            Cc1_b6.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b6.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[2][0] == 0){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[2][0] == 1){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[2][0] == 2){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[2][0] == 3){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[2][0] == 4){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[2][0] == 5){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[2][0] == 6){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[2][0] == 7){
            Cc1_b7.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b7.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[2][1] == 0){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[2][1] == 1){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[2][1] == 2){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[2][1] == 3){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[2][1] == 4){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[2][1] == 5){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[2][1] == 6){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[2][1] == 7){
            Cc1_b8.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b8.setStyle("-fx-background-color: transparent;");
        }
        if(Cc1code[2][2] == 0){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfWPex7uhlKcLBlkOBhb8w_sbaToVjUVheyV7SJEjMjbgLV8mIHyX6zt-OaPBTG9d3zcw-AquKwkk4BI2x1ZfHZxs4Jb-TU9aL4fPlkeC-gGZSrGqw6VorsUMwW4fZPsegl4BCue7Jrg5aJAeZU8R362H_PlGAn-SDD1f94Wm9I5SBCh0qdeIw62Yn/s1600/C-1.1.jpg);");
        }else if(Cc1code[2][2] == 1){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjzVcusRuGHwCM-P987pugwQ8RxCoWB9q-yS6tjANG8UNsfRYWs-GWX1e8nNisP6CIeFfDHOFPdMnSMF8BccWWlxCXIDGsnpVxGUtV37ncxX0FHYTGX886HOomwb7_d-5dnr1sR2LNWAvPfVh-NXOCGV5Y2w9fxjYyNxYz2NeZyXu6_7wgHW3g5Fwy4/s1600/C-1.2.jpg);");
        }else if(Cc1code[2][2] == 2){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiOxWI2azVOpH_jagbADJx0NfCY77mQe1Y3l2P-nXbi_807JfaP-e_GddgKjOlXTxS328FpAkjbJkxFXSPN9E4_eLIUtKsCaf0N0KbcVg2WdMj3JqAx6AQi3Av_BF-yQuogMaOmMeQLqqSBVJiLeOW2QwKZe5hTBNUbWlTolz_e-CMHijLgRtPkfOtx/s1600/C-1.3.jpg);");
        }else if(Cc1code[2][2] == 3){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiuvHeEZ2EsKOoFA7lU5vqeYd-sDNR73oT80E7TWUxPD4co1TOsGcWE2MJSKNFN1aY0BQA4DA-RZ3jkn0qR2Lgx1r3_fE_h1QOqCHUDB2Tsclvx41-BS0qxEQEo_32qCyk57jworJpy6yOwu5vQ3OASz2C-EaDvcf9mZGq9xyclXt0RxQYZGsmG1mRE/s1600/C-1.4.jpg);");
        }else if(Cc1code[2][2] == 4){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEigGZHLez4PThHjrruW_AdToEoZ2sSHDZmOY6RufPfsLz3GIYjUPVx_dFnvUSECQ5AfVDQoGv6zxx5FbRAowPPlHm0zKMnVx05xargVpijR-3Q5Fkd52W9LyfHPObGCSVb_N9kHEegMLOAliISvNVLj9kUcpjWNHUdqUcPhl48siG9r2fZRj1APJlr9/s1600/C-1.5.jpg);");
        }else if(Cc1code[2][2] == 5){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhDTuBeYi57LajBIj19RhFZK4e1ZwL_MR6fu9T9H6y33DuAbZcqcDjF8nIy8WlLc6wuWIyTlDsef8q3LPvq1A1GScYkkpM-p-__ndorOgM-K8NUOE7PWVYbDokm6zwmlNzdEr-NNTH1QCIYFb6l8JX7zv4w7TaF9d7wT4mnkhdv2_ueIUVi3PcQHO1F/s1600/C-1.6.jpg);");
        }else if(Cc1code[2][2] == 6){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi_ow29QICXm1IfXv5G4CNKMCVUC59kcAUZ6kzenmaK154ZTYXv1s8mUPVCkljKbINOtO3aYxcnTA2U0W2qb-FBoqAKRsKQTWB01OcWdSHak0c0zkHd86avexXwewEeTxcorXlutXrpGPzkh7Xf16GAUIFwCu7qObaoNQeg3zxI4tSySA7dHExkRP7R/s1600/C-1.7.jpg);");
        }else if(Cc1code[2][2] == 7){
            Cc1_b9.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj_VtqA067H1f9TsiCcS5Fg5kO1lEnijqjM4XX8YIt_zDQGQZKY0TeNyNO7UaCjU4HnvOII_CZQWdC9g6GAXPEjHD0U_CELSuEoOXu3AhIY3LkXaIdaT8x24ebJrWlSiW3THlevtufdr44gMtmqAyh2OC2s9zbndTQsDQU7QT0i8sEliNJ-Xh6jyq8j/s1600/C-1.8.jpg);");
        }else{
            Cc1_b9.setStyle("-fx-background-color: transparent;");
        }*/
        if(indexs[7] == 0) {
            Cc1_door.setVisible(true);
        }
    }
    public void Cc1_b1onAction(ActionEvent event) throws IOException {
            if (Cc1_mismatch == 0) {
                if (Cc1code[0][1] == 8) {
                    Cc1_b2.setStyle(Cc1_b1.getStyle());
                    Cc1_b1.setStyle("-fx-background-color: transparent;");
                    help_int = Cc1code[0][0];
                    Cc1code[0][0] = Cc1code[0][1];
                    Cc1code[0][1] = help_int;
                }
                if (Cc1code[1][0] == 8) {
                    Cc1_b4.setStyle(Cc1_b1.getStyle());
                    Cc1_b1.setStyle("-fx-background-color: transparent;");
                    help_int = Cc1code[0][0];
                    Cc1code[0][0] = Cc1code[1][0];
                    Cc1code[1][0] = help_int;
                }
                Cc1Operation();
                if(Cc1_mismatch == 0){
                    Cc1_mismatch = 1;
                    indexs[7] = 1;
                    Cc1_door.setVisible(false);
                }else{
                    Cc1_mismatch = 0;
                }
            }
    }
    public void Cc1_b2onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[0][2] == 8) {
                Cc1_b3.setStyle(Cc1_b2.getStyle());
                Cc1_b2.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[0][1];
                Cc1code[0][1] = Cc1code[0][2];
                Cc1code[0][2] = help_int;
            }
            if (Cc1code[1][1] == 8) {
                Cc1_b5.setStyle(Cc1_b2.getStyle());
                Cc1_b2.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[0][1];
                Cc1code[0][1] = Cc1code[1][1];
                Cc1code[1][1] = help_int;
            }
            if (Cc1code[0][0] == 8) {
                Cc1_b1.setStyle(Cc1_b2.getStyle());
                Cc1_b2.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[0][1];
                Cc1code[0][1] = Cc1code[0][0];
                Cc1code[0][0] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }
    public void Cc1_b3onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[1][2] == 8) {
                Cc1_b6.setStyle(Cc1_b3.getStyle());
                Cc1_b3.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[0][2];
                Cc1code[0][2] = Cc1code[1][2];
                Cc1code[1][2] = help_int;
            }
            if (Cc1code[0][1] == 8) {
                Cc1_b2.setStyle(Cc1_b3.getStyle());
                Cc1_b3.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[0][2];
                Cc1code[0][2] = Cc1code[0][1];
                Cc1code[0][1] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }
    public void Cc1_b4onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[0][0] == 8) {
                Cc1_b1.setStyle(Cc1_b4.getStyle());
                Cc1_b4.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][0];
                Cc1code[1][0] = Cc1code[0][0];
                Cc1code[0][0] = help_int;
            }
            if (Cc1code[1][1] == 8) {
                Cc1_b5.setStyle(Cc1_b4.getStyle());
                Cc1_b4.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][0];
                Cc1code[1][0] = Cc1code[1][1];
                Cc1code[1][1] = help_int;
            }
            if (Cc1code[2][0] == 8) {
                Cc1_b7.setStyle(Cc1_b4.getStyle());
                Cc1_b4.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][0];
                Cc1code[1][0] = Cc1code[2][0];
                Cc1code[2][0] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }
    public void Cc1_b5onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[0][1] == 8) {
                Cc1_b2.setStyle(Cc1_b5.getStyle());
                Cc1_b5.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][1];
                Cc1code[1][1] = Cc1code[0][1];
                Cc1code[0][1] = help_int;
            }
            if (Cc1code[1][2] == 8) {
                Cc1_b6.setStyle(Cc1_b5.getStyle());
                Cc1_b5.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][1];
                Cc1code[1][1] = Cc1code[1][2];
                Cc1code[1][2] = help_int;
            }
            if (Cc1code[2][1] == 8) {
                Cc1_b8.setStyle(Cc1_b5.getStyle());
                Cc1_b5.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][1];
                Cc1code[1][1] = Cc1code[2][1];
                Cc1code[2][1] = help_int;
            }
            if (Cc1code[1][0] == 8) {
                Cc1_b4.setStyle(Cc1_b5.getStyle());
                Cc1_b5.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][1];
                Cc1code[1][1] = Cc1code[1][0];
                Cc1code[1][0] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }
    public void Cc1_b6onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[0][2] == 8) {
                Cc1_b3.setStyle(Cc1_b6.getStyle());
                Cc1_b6.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][2];
                Cc1code[1][2] = Cc1code[0][2];
                Cc1code[0][2] = help_int;
            }
            if (Cc1code[1][1] == 8) {
                Cc1_b5.setStyle(Cc1_b6.getStyle());
                Cc1_b6.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][2];
                Cc1code[1][2] = Cc1code[1][1];
                Cc1code[1][1] = help_int;
            }
            if (Cc1code[2][2] == 8) {
                Cc1_b9.setStyle(Cc1_b6.getStyle());
                Cc1_b6.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[1][2];
                Cc1code[1][2] = Cc1code[2][2];
                Cc1code[2][2] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }
    public void Cc1_b7onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[1][0] == 8) {
                Cc1_b4.setStyle(Cc1_b7.getStyle());
                Cc1_b7.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[2][0];
                Cc1code[2][0] = Cc1code[1][0];
                Cc1code[1][0] = help_int;
            }
            if (Cc1code[2][1] == 8) {
                Cc1_b8.setStyle(Cc1_b7.getStyle());
                Cc1_b7.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[2][0];
                Cc1code[2][0] = Cc1code[2][1];
                Cc1code[2][1] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }
    public void Cc1_b8onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[2][0] == 8) {
                Cc1_b7.setStyle(Cc1_b8.getStyle());
                Cc1_b8.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[2][1];
                Cc1code[2][1] = Cc1code[2][0];
                Cc1code[2][0] = help_int;
            }
            if (Cc1code[1][1] == 8) {
                Cc1_b5.setStyle(Cc1_b8.getStyle());
                Cc1_b8.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[2][1];
                Cc1code[2][1] = Cc1code[1][1];
                Cc1code[1][1] = help_int;
            }
            if (Cc1code[2][2] == 8) {
                Cc1_b9.setStyle(Cc1_b8.getStyle());
                Cc1_b8.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[2][1];
                Cc1code[2][1] = Cc1code[2][2];
                Cc1code[2][2] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }
    public void Cc1_b9onAction(ActionEvent event) throws IOException {
        if (Cc1_mismatch == 0) {
            if (Cc1code[2][1] == 8) {
                Cc1_b8.setStyle(Cc1_b9.getStyle());
                Cc1_b9.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[2][2];
                Cc1code[2][2] = Cc1code[2][1];
                Cc1code[2][1] = help_int;
            }
            if (Cc1code[1][2] == 8) {
                Cc1_b6.setStyle(Cc1_b9.getStyle());
                Cc1_b9.setStyle("-fx-background-color: transparent;");
                help_int = Cc1code[2][2];
                Cc1code[2][2] = Cc1code[1][2];
                Cc1code[1][2] = help_int;
            }
            Cc1Operation();
            if(Cc1_mismatch == 0){
                Cc1_mismatch = 1;
                indexs[7] = 1;
                Cc1_door.setVisible(false);
            }else{
                Cc1_mismatch = 0;
            }
        }
    }







    public void C3onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiPBDUTcVAiwsCWsmuIR56hSYGurDhS1CJQ8wdYRJGzetBc8pdU-tQlVhG0BqGb1Buxb6h6igsBkqtqDRzs0cYjCEVEav_gjWz5WbUhfhOvFM_A6L79kOeZltRtBKrmCN1cnnqv_92druAMGStVL4GbzSWGseGpTj7adInBQa0n6pov_z19IdqobbvY/s16000/C-3.png);");
        pane.setStyle("-fx-background-image:url('"+p_c3+"')");
        help_int = 0;
        b_return.setVisible(true);
        door_key1.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        C1_b1.setVisible(false);
        C1_b2.setVisible(false);
        C1_b3.setVisible(false);
        C1_b4.setVisible(false);
        C1_b5.setVisible(false);
        C1_b6.setVisible(false);
        C1_b7.setVisible(false);
        C1_b8.setVisible(false);
        C1_b9.setVisible(false);
        C1_door.setVisible(false);
        C3.setVisible(false);
        C2.setVisible(false);
        C4.setVisible(false);
        Cc3_b1.setVisible(true);
        Cc3_b2.setVisible(true);
        Cc3_b3.setVisible(true);
        Cc3_b4.setVisible(true);
        Cc3_b5.setVisible(true);
        Cc3_b6.setVisible(true);
        Cc3_b7.setVisible(true);
        Cc3_b8.setVisible(true);
        Cc3_b9.setVisible(true);
        Cc3_text.setVisible(true);
        C_door.setVisible(false);
        C_door_open.setVisible(false);
        if(Cc3_mismatch == 1) {
            Cc3music_play();
        }
        //Cc3music_play();
    }
    public void Cc3_b1onAction(ActionEvent event) throws IOException {
            if(Cc3_mismatch ==0) {
                help_int = 7;
                Cc3Operation();
                if(Cc3_code == 0){
                    if(help_int > 0){
                        Cc3_text.setText(String.valueOf(help_int));
                        delay(1000, () -> Cc3_text.setText(null));
                    }
                    if(Cc3_mismatch == 1){
                        Cc3_text.setText(null);
                        //Cc3music_play();
                    }
                    //Cc3_text.setText(null);
                }else {
                    Cc3_text.setText(String.valueOf(Cc3_code));
                }
                if(Cc3_mismatch == 1){
                    Cc3music_play();
                }
            }
    }
    public void Cc3_b2onAction(ActionEvent event) throws IOException {
        if(Cc3_mismatch ==0) {
            help_int = 8;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }

                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }
    public void Cc3_b3onAction(ActionEvent event) throws IOException {
        if(Cc3_mismatch ==0) {
            help_int = 9;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }
                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }
    public void Cc3_b4onAction(ActionEvent event) throws IOException {
        if(Cc3_mismatch ==0) {
            help_int = 4;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }
                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }
    public void Cc3_b5onAction(ActionEvent event) throws IOException {
        if(Cc3_mismatch ==0) {
            help_int = 5;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }
                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }
    public void Cc3_b6onAction(ActionEvent event) throws IOException {
        if(Cc3_mismatch ==0) {
            help_int = 6;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }
                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }
    public void Cc3_b7onAction(ActionEvent event) throws IOException {
        if(Cc3_mismatch ==0) {
            help_int = 1;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }
                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }
    public void Cc3_b8onAction(ActionEvent event) throws IOException {
        if(Cc3_mismatch ==0) {
            help_int = 2;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }
                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }
    public void Cc3_b9onAction(ActionEvent event) throws IOException, InterruptedException {
        if(Cc3_mismatch ==0) {
            help_int = 3;
            Cc3Operation();
            if(Cc3_code == 0){
                if(help_int > 0){
                    Cc3_text.setText(String.valueOf(help_int));
                    delay(1000, () -> Cc3_text.setText(null));
                }
                if(Cc3_mismatch == 1){
                    Cc3_text.setText(null);
                    //Cc3music_play();
                }
                //Cc3_text.setText(null);
            }else {
                Cc3_text.setText(String.valueOf(Cc3_code));
            }
            if(Cc3_mismatch == 1){
                Cc3music_play();
            }
        }
    }


    public static void delay(long millis, Runnable continuation) {
        Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try { Thread.sleep(millis); }
                catch (InterruptedException e) { }
                return null;
            }
        };
        sleeper.setOnSucceeded(event -> continuation.run());
        new Thread(sleeper).start();
    }










    public void C2onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh2_R2SAHvf32lvzE5teYmthsE6yhBdKIgKUJC7etRM0E6iGv7M9ZwnKiUoazczz10TQ_aUP6Ec8GRxfHfQRCvEhsgeHA2cf6Sxl97BBLycDjnNlFM2kr15cTU2qOe3jrg15zdq887ondzduR8bec-SdcxmdHpCK4zxKW5xw6k5r2_8dU5rnXYSoPKD/s16000/C-2.png);");
        pane.setStyle("-fx-background-image:url('" + p_C2 + "')");
        b_return.setVisible(true);
        door_key1.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        C1_b1.setVisible(false);
        C1_b2.setVisible(false);
        C1_b3.setVisible(false);
        C1_b4.setVisible(false);
        C1_b5.setVisible(false);
        C1_b6.setVisible(false);
        C1_b7.setVisible(false);
        C1_b8.setVisible(false);
        C1_b9.setVisible(false);
        C1_door.setVisible(false);
        C3.setVisible(false);
        C2.setVisible(false);
        C4.setVisible(false);
        Cc2_b.setVisible(true);
        C_door.setVisible(false);
        C_door_open.setVisible(false);
    }
    public void Cc2_bonAction(ActionEvent event) throws IOException {
            if(Cc2_press == 0) {
                translate11.setByY(-300);
                translate11.setNode(Cc2_b);
                translate11.play();
                Cc2_press =1;
            }
    }





    public void C4onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj86laeIoQMGIGuwQbc9apoSLtGJ5eYzUbuBLwtCTqdd8lSkIEEPQ4oU41YEE7HxE5o4Zo8U7DU_LcV5a7ez1auulZsbCzKVN5P1yyEFvglftmu5arBDm41D5NCwYKxK1TE0KcX02nn8kppUxFv8mQF2KfN1r67iqZp_JawldYwNsnBu2dS7BiKcH5C/s16000/C-4.png);");
        pane.setStyle("-fx-background-image:url('" + p_C4 + "')");
        b_return.setVisible(true);
        door_key1.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        C1_b1.setVisible(false);
        C1_b2.setVisible(false);
        C1_b3.setVisible(false);
        C1_b4.setVisible(false);
        C1_b5.setVisible(false);
        C1_b6.setVisible(false);
        C1_b7.setVisible(false);
        C1_b8.setVisible(false);
        C1_b9.setVisible(false);
        C1_door.setVisible(false);
        C3.setVisible(false);
        C2.setVisible(false);
        C4.setVisible(false);
        Cc4_b.setVisible(true);
        C_door.setVisible(false);
        C_door_open.setVisible(false);
    }
    public void Cc4_bonAction(ActionEvent event) throws IOException {
        if(Cc4_press == 0) {
            translate12.setByY(-300);
            translate12.setNode(Cc4_b);
            translate12.play();
            Cc4_press =1;
        }
    }





    public void C_dooronAction(ActionEvent event) throws IOException {
            if(indexs[10] == 0){
                C_door.setStyle("-fx-background-color: transparent;");
                C_door_open.setVisible(true);
            }
            if(indexs[10] == 1){
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhHvaGDXISIi9GWjgBpZRrSrF0U649LLaO5s2d5FWAY9OpgD5q9KObPxn3aCahYMDLIuXOY1_Vn4K7LqVYKqmBCeNR6-dYpfsTAPYmfDXOAXB_T8kY9EZJoFWUyr530qNgnxMlSMwKatkSOkiieOQ4-n3yVFGd0EoiZQWj8sCqczNcQKYClZTOZRG-h/s16000/G.png);");
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZ7Asw0F_OdvD0kVvgHO9B5v-n7iVoz-ElJdfDUVdwEWqMb9T85XSEuYK_094ArFGIwiqib7qH0Fl9xKhS3N_1H0806b8ociZOAiGr5ecAHx7u1flUbP4JpSwtLNDH2ks8cfFWGM8fLx7uX2PKhTEAEtlTudw0Zg5wUIpYlLF42pnE7i-kpWR0Rmm6/s16000/Gr.jpg);");
                pane.setStyle("-fx-background-image:url('" + p_G + "')");
                door_key1.setVisible(false);
                C1_b1.setVisible(false);
                C1_b2.setVisible(false);
                C1_b3.setVisible(false);
                C1_b4.setVisible(false);
                C1_b5.setVisible(false);
                C1_b6.setVisible(false);
                C1_b7.setVisible(false);
                C1_b8.setVisible(false);
                C1_b9.setVisible(false);
                C1_door.setVisible(false);
                C3.setVisible(false);
                C2.setVisible(false);
                C4.setVisible(false);
                C_door.setVisible(false);
                C_door_open.setVisible(false);
                G1_button.setVisible(true);
                G1_ring1.setVisible(true);
                G1_ring2.setVisible(true);
                G1_ring3.setVisible(true);
                G1_ring4.setVisible(true);
                G1_touch_area.setVisible(true);
                room_index = 7;
            }
            indexs[10] = 1;

    }















    public void D1onAction(ActionEvent event) throws IOException {

            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhtHi3j0_OlvgSWHO62K5k-EqA2hWRTjBx6qSfsQAhwO5pZCyFbUspXlFg8AvTwbu_f0FRbh4b2LJSQ0Xgeauefk3jQt2SmvDZ9fpyoxJbeyW2vnhFKccfZJVltjz4NAPv0sjpaPTrCSKSOALOutR3WcwbsR-O_gBe_b-JCA3znGSE_R-lxT5e6d3oP/s16000/D-1r.jpg);");
        pane.setStyle("-fx-background-image:url('"+p_D1+"')");
        if(indexs[8] ==1 ) {
            //Dd1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjW_6rGrrPyFvTuLyZ32CPkzrYDKDYXUhCawvKCp3Mr3ekbFZWMGKfWNO4jdr13K1UuBjxxXZLmwR9VFWiyJi1pmCu4Va2acxJ6NYRHZ6L6X20OZYyrJcq3sskcjgOJfv8-VV-T8eCShIPo13AQFSmQMjmFYehhr8RXw--98nhiBkefK63Kk6s5ZbT0/s16000/D-1.open.jpg);");
            Dd1.setStyle("-fx-background-image:url('" + im_D1_1_open + "')");
        }
        b_return.setVisible(true);
        door_key1.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
            D1.setVisible(false);
        Dd1.setVisible(true);
    }

    public void Dd1onAction(ActionEvent event) throws IOException {
            indexs[9] = 1;
            if(indexs[8] ==0 ) {
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhwVjOYirlgdQF1gYXT1H0N8O_h-9gtbgvW_p2IqeO_oB9A5H74IKZl_GQBr6_0BdxxwzswJDbvuIyYYdGPBoMlg1qPuzMljnOhoEa-c3WG_s6aM3kvm_X2P2y2s9DyIv5gMVjGM_cqBVek_jX-eRM6dAyBcrLmDewAcSO6EtTfhuCEkinC1LrkP8_3/s16000/D-1.1.png);");
                pane.setStyle("-fx-background-image:url('"+p_D1_1_1_close+"')");
                Dd1d1_b1.setVisible(true);
                Dd1d1_b2.setVisible(true);
                Dd1d1_b3.setVisible(true);
                Dd1d1_b4.setVisible(true);
            }
            if(indexs[8] == 1){
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi5ZOugrEDb0ZogpcP3QDxkcQR3GvTNFI0pXjcGnzocq6YRHoG43h2Ezuf57fhXLrz_wL1LjoQNeBCHCv-gukt4FomeWwZ4AhURnYtNA88ip644oPQ3q9oMCxs75SRPrDdtr62clhishBoB1gQJLfeA7DnMbd9eYyhy_QQCyG-32E-PQxA55iPunGH3/s16000/D-1.1.open.jpg);");
                pane.setStyle("-fx-background-image:url('"+p_D1_1_1_open+"')");
            }
            Dd1.setVisible(false);
    }
    public void Dd1d1_b1onAction(ActionEvent event) throws IOException {
        Dd1d1code[0] = Dd1d1code[0] + 1;
        if (Dd1d1code[0] ==10){
            Dd1d1code[0] = 0;
        }
        if (Dd1d1code[0] == Dd1d1answer[0]&&Dd1d1code[1] == Dd1d1answer[1]&&Dd1d1code[2] == Dd1d1answer[2]&&Dd1d1code[3] == Dd1d1answer[3]){
            Dd1d1_b1.setVisible(false);
            Dd1d1_b2.setVisible(false);
            Dd1d1_b3.setVisible(false);
            Dd1d1_b4.setVisible(false);
            indexs[8] = 1;
            door_music();
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi5ZOugrEDb0ZogpcP3QDxkcQR3GvTNFI0pXjcGnzocq6YRHoG43h2Ezuf57fhXLrz_wL1LjoQNeBCHCv-gukt4FomeWwZ4AhURnYtNA88ip644oPQ3q9oMCxs75SRPrDdtr62clhishBoB1gQJLfeA7DnMbd9eYyhy_QQCyG-32E-PQxA55iPunGH3/s16000/D-1.1.open.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_D1_1_1_open+"')");
        }
        Dd1d1_b1.setText(String.valueOf(Dd1d1code[0]));
    }

    public void Dd1d1_b2onAction(ActionEvent event) throws IOException {
        Dd1d1code[1] = Dd1d1code[1] + 1;
        if (Dd1d1code[1] ==10){
            Dd1d1code[1] = 0;
        }
        if (Dd1d1code[0] == Dd1d1answer[0]&&Dd1d1code[1] == Dd1d1answer[1]&&Dd1d1code[2] == Dd1d1answer[2]&&Dd1d1code[3] == Dd1d1answer[3]){
            Dd1d1_b1.setVisible(false);
            Dd1d1_b2.setVisible(false);
            Dd1d1_b3.setVisible(false);
            Dd1d1_b4.setVisible(false);
            indexs[8] = 1;
            door_music();
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi5ZOugrEDb0ZogpcP3QDxkcQR3GvTNFI0pXjcGnzocq6YRHoG43h2Ezuf57fhXLrz_wL1LjoQNeBCHCv-gukt4FomeWwZ4AhURnYtNA88ip644oPQ3q9oMCxs75SRPrDdtr62clhishBoB1gQJLfeA7DnMbd9eYyhy_QQCyG-32E-PQxA55iPunGH3/s16000/D-1.1.open.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_D1_1_1_open+"')");

        }
        Dd1d1_b2.setText(String.valueOf(Dd1d1code[1]));

    }
    public void Dd1d1_b3onAction(ActionEvent event) throws IOException {
        Dd1d1code[2] = Dd1d1code[2] + 1;
        if (Dd1d1code[2] ==10){
            Dd1d1code[2] = 0;
        }
        if (Dd1d1code[0] == Dd1d1answer[0]&&Dd1d1code[1] == Dd1d1answer[1]&&Dd1d1code[2] == Dd1d1answer[2]&&Dd1d1code[3] == Dd1d1answer[3]){
            Dd1d1_b1.setVisible(false);
            Dd1d1_b2.setVisible(false);
            Dd1d1_b3.setVisible(false);
            Dd1d1_b4.setVisible(false);
            indexs[8] = 1;
            door_music();
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi5ZOugrEDb0ZogpcP3QDxkcQR3GvTNFI0pXjcGnzocq6YRHoG43h2Ezuf57fhXLrz_wL1LjoQNeBCHCv-gukt4FomeWwZ4AhURnYtNA88ip644oPQ3q9oMCxs75SRPrDdtr62clhishBoB1gQJLfeA7DnMbd9eYyhy_QQCyG-32E-PQxA55iPunGH3/s16000/D-1.1.open.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_D1_1_1_open+"')");

        }
        Dd1d1_b3.setText(String.valueOf(Dd1d1code[2]));

    }
    public void Dd1d1_b4onAction(ActionEvent event) throws IOException {
        Dd1d1code[3] = Dd1d1code[3] + 1;
        if (Dd1d1code[3] ==10){
            Dd1d1code[3] = 0;
        }
        if (Dd1d1code[0] == Dd1d1answer[0]&&Dd1d1code[1] == Dd1d1answer[1]&&Dd1d1code[2] == Dd1d1answer[2]&&Dd1d1code[3] == Dd1d1answer[3]){
            Dd1d1_b1.setVisible(false);
            Dd1d1_b2.setVisible(false);
            Dd1d1_b3.setVisible(false);
            Dd1d1_b4.setVisible(false);
            indexs[8] = 1;
            door_music();
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi5ZOugrEDb0ZogpcP3QDxkcQR3GvTNFI0pXjcGnzocq6YRHoG43h2Ezuf57fhXLrz_wL1LjoQNeBCHCv-gukt4FomeWwZ4AhURnYtNA88ip644oPQ3q9oMCxs75SRPrDdtr62clhishBoB1gQJLfeA7DnMbd9eYyhy_QQCyG-32E-PQxA55iPunGH3/s16000/D-1.1.open.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_D1_1_1_open+"')");

        }
        Dd1d1_b4.setText(String.valueOf(Dd1d1code[3]));

    }












    public void E_dooronAction(ActionEvent event) throws IOException{
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg1fiYNSLo6kbFfcW4oayKGYo_h5_6FlqiRTTWQoMztm_J7ZyJTv1TglUB05DXuTj9TzX6ER67GP0Wa2-dsFHOKP3rW59OTOy1JRLACZIUePtXKwYDMUaY0iz6BJXLzCLyZUNUcCf8cf3ommScy68Kw8SnYAjr7NLYZQxnR3alhHPjUXObujeLpqsHA/s16000/Ar.jpg);");
        pane.setStyle("-fx-background-image:url('"+p_A+"')");
        E_door.setVisible(false);
        E3_open.setVisible(false);
        E3.setVisible(false);
        E2_b1.setVisible(false);
        E2_b2.setVisible(false);
        E2_b3.setVisible(false);
        room_index = 1;
        door.setVisible(true);
        E1.setVisible(false);
        A3.setVisible(true);
        A4.setVisible(true);
        A5.setVisible(true);
        if (things[1]==0) {
            Thing1_A.setVisible(true);
        }
        //D1.setVisible(false);
        Text.setText("A");
        if(door1_index == 0) {
            idoor1.setVisible(true);
        }
        if(indexs[1] == 1) {
            A2_open.setVisible(true);
            A2_close.setVisible(true);
            A2_close.setStyle("-fx-background-color: transparent;");
        }
        if(indexs[1] == 0) {
            A2_close.setVisible(true);
        }

        if(indexs[3] == 1) {
            A1_open.setVisible(true);
            A1.setVisible(true);
            A1.setStyle("-fx-background-color: transparent;");
        }
        if(indexs[3] == 0 || indexs[3] == 2) {
            A1.setVisible(true);
        }
    }





    public void E1onAction(ActionEvent event) throws IOException{
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg_KFA9aGRJba_mSfbJonBu_nzwyBlmxw_iviRGqEqbnHJpDj8xUNunO-4dnaE7M9nNYHajMiWE0a2QJKqervbL9-iDcZzNRz7sKQW6asSOh5YTSIxJaYirc94Gi0FLbdLag50BjP3w7pyWWw_7koP4VirTo1wGb92fDTG8E5nkLGtI9T4Y48_P0BzS/s16000/E-1r.jpg);");
        pane.setStyle("-fx-background-image:url('"+p_E1+"')");
        b_return.setVisible(true);
        left.setVisible(false);
        right.setVisible(false);
        E_door.setVisible(false);
        E3_open.setVisible(false);
        E3.setVisible(false);
        E2_b1.setVisible(false);
        E2_b2.setVisible(false);
        E2_b3.setVisible(false);
        E1.setVisible(false);
        Ee1_b1.setVisible(true);
        Ee1_b2.setVisible(true);
        Ee1_b3.setVisible(true);
        Ee1_b4.setVisible(true);
        Ee1_b5.setVisible(true);
        Ee1_door.setVisible(true);
        Ee1_reset.setVisible(true);
        if(indexs[15] == 0) {
            //Ee1_door.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfrwcC6t_H7jhckRBT5UrxYtEe0nc_t7UB994OxmplEfjw0vPpn1b5aN_5N6hjpbqhrYbuZJ7gZCXC4kS3I4n1S5gSErc4mGugKl4SCCfdIlwcRuHIea20xhIlzFYUQ8WDxMRkqmr12pqgO0zJcgcSVXdvBufngJd9BAMj-C8q-Nltl4H3f9CEc4I0/s16000/E-1.door.close.jpg);");
            Ee1_door.setStyle("-fx-image:url('" + im_E1_1_door_close + "')");
        }
        if(indexs[15] == 1) {
            //Ee1_door.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgOzxvf3MuAxuQxAEtSgXjkoh2qWUOifWhRwek47TW130hZ6FufeYY2EnT7hGZv7arFHfV1nYUHiPNwe8HDMSHH88HozC7rtLBpGHu628fCYG0MEdxpeMBCJm-2ioCS08UbITFS5NKV4Ui4eea_ATOVkvzbMrfd5NQg_FaSS7-xg4XmUfCd17TV5yGl/s16000/E-1.door.open.jpg);");
            Ee1_door.setStyle("-fx-image:url('" + im_E1_1_door_open + "')");
            H2_clue_1.setVisible(true);
            H2_clue_2.setVisible(true);
            H2_clue_3.setVisible(true);
            H2_clue_4.setVisible(true);
        }
    }
    public void Ee1_b1onAction(ActionEvent event) throws IOException {
        if (indexs[15] == 0) {
            help_int = 1;
            Ee1Operation();
            if (Ee1_mismatch == 0) {
                indexs[15] = 1;
                //Ee1_door.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgOzxvf3MuAxuQxAEtSgXjkoh2qWUOifWhRwek47TW130hZ6FufeYY2EnT7hGZv7arFHfV1nYUHiPNwe8HDMSHH88HozC7rtLBpGHu628fCYG0MEdxpeMBCJm-2ioCS08UbITFS5NKV4Ui4eea_ATOVkvzbMrfd5NQg_FaSS7-xg4XmUfCd17TV5yGl/s16000/E-1.door.open.jpg);");
                Ee1_door.setStyle("-fx-image:url('" + im_E1_1_door_open + "')");
                H2_clue_1.setVisible(true);
                H2_clue_2.setVisible(true);
                H2_clue_3.setVisible(true);
                H2_clue_4.setVisible(true);

            }
            //Ee1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh0S6XahUUWDnJ0hdR3vuguGJB_ZsC8FT2YoS9ViO9ZDlBP6IzEkDcunjT43_UZNJtIJ4Y7GBGWxn5tsAwFyR6fAKIHaDW-hTfYvt_jv5a1RzJDNK33uUdD6SlyW-FUXbIWaUNBFoViknHMgnD2ho9OmEtst2VkP0OVah9ev2VbeBBHrHGyhEkhgjzo/s1600/E-1.key.down.jpg);");
            Ee1_b1.setStyle("-fx-background-image:url('" + im_E1_1_key_down + "')");
            //delay(700, () -> Ee1_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiP6UJ0wrXV3ffBcqig6_wJrrKGrrCfTYFVluFkN0Na9Q2ig4Byw4IaL-2u0ZMwuMgoOkviCq0eZV_4wl_aPtCYRk0FoQFzcpIzFHiUPj2Ul5rETUEJMwlSVJYEJHin7idWwd8u7pj5F-igt4eN8ZVEkOJ21gsokBs0fOEdi2LuDOOJeoFyPlz7vU_W/s1600/E-1.key.up.jpg);"));
            A_note_play();
            delay(700, () -> Ee1_b1.setStyle("-fx-background-image:url('" + im_E1_1_key_up+ "')"));
        }
    }
    public void Ee1_b2onAction(ActionEvent event) throws IOException {
        if (indexs[15] == 0) {
            help_int = 2;
            Ee1Operation();
            if (Ee1_mismatch == 0) {
                indexs[15] = 1;
                //Ee1_door.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgOzxvf3MuAxuQxAEtSgXjkoh2qWUOifWhRwek47TW130hZ6FufeYY2EnT7hGZv7arFHfV1nYUHiPNwe8HDMSHH88HozC7rtLBpGHu628fCYG0MEdxpeMBCJm-2ioCS08UbITFS5NKV4Ui4eea_ATOVkvzbMrfd5NQg_FaSS7-xg4XmUfCd17TV5yGl/s16000/E-1.door.open.jpg);");
                Ee1_door.setStyle("-fx-image:url('" + im_E1_1_door_open + "')");
                H2_clue_1.setVisible(true);
                H2_clue_2.setVisible(true);
                H2_clue_3.setVisible(true);
                H2_clue_4.setVisible(true);
            }
            //Ee1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh0S6XahUUWDnJ0hdR3vuguGJB_ZsC8FT2YoS9ViO9ZDlBP6IzEkDcunjT43_UZNJtIJ4Y7GBGWxn5tsAwFyR6fAKIHaDW-hTfYvt_jv5a1RzJDNK33uUdD6SlyW-FUXbIWaUNBFoViknHMgnD2ho9OmEtst2VkP0OVah9ev2VbeBBHrHGyhEkhgjzo/s1600/E-1.key.down.jpg);");
            Ee1_b2.setStyle("-fx-background-image:url('" + im_E1_1_key_down + "')");
            //delay(700, () -> Ee1_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiP6UJ0wrXV3ffBcqig6_wJrrKGrrCfTYFVluFkN0Na9Q2ig4Byw4IaL-2u0ZMwuMgoOkviCq0eZV_4wl_aPtCYRk0FoQFzcpIzFHiUPj2Ul5rETUEJMwlSVJYEJHin7idWwd8u7pj5F-igt4eN8ZVEkOJ21gsokBs0fOEdi2LuDOOJeoFyPlz7vU_W/s1600/E-1.key.up.jpg);"));
            B_note_play();
            delay(700, () -> Ee1_b2.setStyle("-fx-background-image:url('" + im_E1_1_key_up + "')"));
        }
    }
    public void Ee1_b3onAction(ActionEvent event) throws IOException {
        if (indexs[15] == 0) {
            help_int = 3;
            Ee1Operation();
            if (Ee1_mismatch == 0) {
                indexs[15] = 1;
                //Ee1_door.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgOzxvf3MuAxuQxAEtSgXjkoh2qWUOifWhRwek47TW130hZ6FufeYY2EnT7hGZv7arFHfV1nYUHiPNwe8HDMSHH88HozC7rtLBpGHu628fCYG0MEdxpeMBCJm-2ioCS08UbITFS5NKV4Ui4eea_ATOVkvzbMrfd5NQg_FaSS7-xg4XmUfCd17TV5yGl/s16000/E-1.door.open.jpg);");
                Ee1_door.setStyle("-fx-image:url('" + im_E1_1_door_open + "')");
                H2_clue_1.setVisible(true);
                H2_clue_2.setVisible(true);
                H2_clue_3.setVisible(true);
                H2_clue_4.setVisible(true);
            }
            //Ee1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh0S6XahUUWDnJ0hdR3vuguGJB_ZsC8FT2YoS9ViO9ZDlBP6IzEkDcunjT43_UZNJtIJ4Y7GBGWxn5tsAwFyR6fAKIHaDW-hTfYvt_jv5a1RzJDNK33uUdD6SlyW-FUXbIWaUNBFoViknHMgnD2ho9OmEtst2VkP0OVah9ev2VbeBBHrHGyhEkhgjzo/s1600/E-1.key.down.jpg);");
            Ee1_b3.setStyle("-fx-background-image:url('" + im_E1_1_key_down + "')");
            //delay(700, () -> Ee1_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiP6UJ0wrXV3ffBcqig6_wJrrKGrrCfTYFVluFkN0Na9Q2ig4Byw4IaL-2u0ZMwuMgoOkviCq0eZV_4wl_aPtCYRk0FoQFzcpIzFHiUPj2Ul5rETUEJMwlSVJYEJHin7idWwd8u7pj5F-igt4eN8ZVEkOJ21gsokBs0fOEdi2LuDOOJeoFyPlz7vU_W/s1600/E-1.key.up.jpg);"));
            C_note_play();
            delay(700, () -> Ee1_b3.setStyle("-fx-background-image:url('" + im_E1_1_key_up + "')"));
        }
    }
    public void Ee1_b4onAction(ActionEvent event) throws IOException {
        if (indexs[15] == 0) {
            help_int = 4;
            Ee1Operation();
            if (Ee1_mismatch == 0) {
                indexs[15] = 1;
                //Ee1_door.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgOzxvf3MuAxuQxAEtSgXjkoh2qWUOifWhRwek47TW130hZ6FufeYY2EnT7hGZv7arFHfV1nYUHiPNwe8HDMSHH88HozC7rtLBpGHu628fCYG0MEdxpeMBCJm-2ioCS08UbITFS5NKV4Ui4eea_ATOVkvzbMrfd5NQg_FaSS7-xg4XmUfCd17TV5yGl/s16000/E-1.door.open.jpg);");
                Ee1_door.setStyle("-fx-image:url('" + im_E1_1_door_open + "')");
                H2_clue_1.setVisible(true);
                H2_clue_2.setVisible(true);
                H2_clue_3.setVisible(true);
                H2_clue_4.setVisible(true);
            }
            //Ee1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh0S6XahUUWDnJ0hdR3vuguGJB_ZsC8FT2YoS9ViO9ZDlBP6IzEkDcunjT43_UZNJtIJ4Y7GBGWxn5tsAwFyR6fAKIHaDW-hTfYvt_jv5a1RzJDNK33uUdD6SlyW-FUXbIWaUNBFoViknHMgnD2ho9OmEtst2VkP0OVah9ev2VbeBBHrHGyhEkhgjzo/s1600/E-1.key.down.jpg);");
            Ee1_b4.setStyle("-fx-background-image:url('" + im_E1_1_key_down + "')");
            //delay(700, () -> Ee1_b4.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiP6UJ0wrXV3ffBcqig6_wJrrKGrrCfTYFVluFkN0Na9Q2ig4Byw4IaL-2u0ZMwuMgoOkviCq0eZV_4wl_aPtCYRk0FoQFzcpIzFHiUPj2Ul5rETUEJMwlSVJYEJHin7idWwd8u7pj5F-igt4eN8ZVEkOJ21gsokBs0fOEdi2LuDOOJeoFyPlz7vU_W/s1600/E-1.key.up.jpg);"));
            D_note_play();
            delay(700, () -> Ee1_b4.setStyle("-fx-background-image:url('" + im_E1_1_key_up + "')"));
        }
    }
    public void Ee1_b5onAction(ActionEvent event) throws IOException  {
        if (indexs[15] == 0) {
            help_int = 5;
            Ee1Operation();
            if (Ee1_mismatch == 0) {
                indexs[15] = 1;
                //Ee1_door.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgOzxvf3MuAxuQxAEtSgXjkoh2qWUOifWhRwek47TW130hZ6FufeYY2EnT7hGZv7arFHfV1nYUHiPNwe8HDMSHH88HozC7rtLBpGHu628fCYG0MEdxpeMBCJm-2ioCS08UbITFS5NKV4Ui4eea_ATOVkvzbMrfd5NQg_FaSS7-xg4XmUfCd17TV5yGl/s16000/E-1.door.open.jpg);");
                Ee1_door.setStyle("-fx-image:url('" + im_E1_1_door_open + "')");
                H2_clue_1.setVisible(true);
                H2_clue_2.setVisible(true);
                H2_clue_3.setVisible(true);
                H2_clue_4.setVisible(true);
            }
            //Ee1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh0S6XahUUWDnJ0hdR3vuguGJB_ZsC8FT2YoS9ViO9ZDlBP6IzEkDcunjT43_UZNJtIJ4Y7GBGWxn5tsAwFyR6fAKIHaDW-hTfYvt_jv5a1RzJDNK33uUdD6SlyW-FUXbIWaUNBFoViknHMgnD2ho9OmEtst2VkP0OVah9ev2VbeBBHrHGyhEkhgjzo/s1600/E-1.key.down.jpg);");
            Ee1_b5.setStyle("-fx-background-image:url('" + im_E1_1_key_down + "')");
            //delay(700, () -> Ee1_b5.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiP6UJ0wrXV3ffBcqig6_wJrrKGrrCfTYFVluFkN0Na9Q2ig4Byw4IaL-2u0ZMwuMgoOkviCq0eZV_4wl_aPtCYRk0FoQFzcpIzFHiUPj2Ul5rETUEJMwlSVJYEJHin7idWwd8u7pj5F-igt4eN8ZVEkOJ21gsokBs0fOEdi2LuDOOJeoFyPlz7vU_W/s1600/E-1.key.up.jpg);"));
            E_note_play();
            delay(700, () -> Ee1_b5.setStyle("-fx-background-image:url('" + im_E1_1_key_up + "')"));

        }
    }
    public void Ee1_resetonAction(ActionEvent event) throws IOException {
        if (indexs[15] == 0) {
            for (int i = 0; i < 5; i++) {
                E1code[i] = 0;
            }
        }
    }



    public void E2onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSYSkVmxJCy_1oADiIwZQDQDG_A0_Z7aDWosYQz4qlXElL_KL4wC1lEH_dDeMYqpjSgFjUoyrENyhrr3Z-g0UcsOOBVyqibfX58XMjeOgBGli3MipiHVglktGS44LXNKFnHs1v2ygVF1JnofVU2ChWM2bmIdD73195SrY3FYW0PLthWlE-7gVliEnC/s16000/E-2r.jpg);");
        pane.setStyle("-fx-background-image:url('" + p_E2 + "')");
        b_return.setVisible(true);
        //door_key1.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        E_door.setVisible(false);
        E3_open.setVisible(false);
        E3.setVisible(false);
        E2_b1.setVisible(false);
        E2_b2.setVisible(false);
        E2_b3.setVisible(false);
        Ee2_b1.setVisible(true);
        Ee2_b2.setVisible(true);
        Ee2_b3.setVisible(true);
        E1.setVisible(false);
        if (indexs[12] == 0) {
            //Ee2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            Ee2_b1.setStyle("-fx-background-image:url('" + im_E2_1_door_close + "')");
        }
        if (indexs[12] == 1) {
            //Ee2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            Ee2_b1.setStyle("-fx-background-image:url('" + im_E2_1_door_open + "')");
        }
        if (indexs[13] == 0) {
            //Ee2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            Ee2_b2.setStyle("-fx-background-image:url('" + im_E2_1_door_close + "')");
        }
        if (indexs[13] == 1) {
            //Ee2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            Ee2_b2.setStyle("-fx-background-image:url('" + im_E2_1_door_open + "')");
        }
        if (indexs[14] == 0) {
            //Ee2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            Ee2_b3.setStyle("-fx-background-image:url('" + im_E2_1_door_close + "')");
        }
        if (indexs[14] == 1) {
            //Ee2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            Ee2_b3.setStyle("-fx-background-image:url('" + im_E2_1_door_open + "')");
        }
    }
    public void Ee2_b1onAction(ActionEvent event) throws IOException {
        if(indexs[12] == 0) {
            //Ee2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            //Ee2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            Ee2_b1.setStyle("-fx-background-image:url('" + im_E2_1_door_open + "')");
            indexs[12] = 1;
        }else if(indexs[12] == 1) {
           // Ee2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            Ee2_b1.setStyle("-fx-background-image:url('" + im_E2_1_door_close + "')");
            //Ee2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            indexs[12] = 0;
        }
    }
    public void Ee2_b2onAction(ActionEvent event) throws IOException {
        if(indexs[13] == 0) {
            //Ee2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            //Ee2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            Ee2_b2.setStyle("-fx-background-image:url('" + im_E2_1_door_open + "')");
            indexs[13] = 1;
        }else if(indexs[13] == 1) {
           // Ee2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            //Ee2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            Ee2_b2.setStyle("-fx-background-image:url('" + im_E2_1_door_close + "')");
            indexs[13] = 0;
        }
    }
    public void Ee2_b3onAction(ActionEvent event) throws IOException {
        if(indexs[14] == 0) {
           // Ee2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            //Ee2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            Ee2_b3.setStyle("-fx-background-image:url('" + im_E2_1_door_open + "')");
            indexs[14] = 1;
        } else if(indexs[14] == 1) {
            //Ee2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhaJwBQgFCGUv7zk1RNUin0Mcic9S1NGNdPP0-J07nNf9vASlKOCBix_vGSFHMS7jqynbaW39r35NyAOso0ZD16KPSGSc2pszuoXgxHBhaaHbthtU3R-W1R-UxNWnhKvAJZ42KOqBSJOg6aXgYqsZF7gO-768P6wl6r18m3L0fOXghHNHayw0Ek_spL/s16000/E-2.close.jpg);");
            //Ee2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj-vBEMrMsOINtCRcoX4wcNcmBItvpwHPOSa8i2PAUgg9yrC_eGULXk2sjmztOKMudUnWs9eEYUkf0esHqpqUmO8wzySvO2IAfQT7HMLxEpCTBC_2iDibwRKuwyQ1oW7x-hhSjfu6myILp5AfS0pck3OL4d2EUbVqd50_aPh8zDD_qaW2NcuhAYbXHT/s16000/E-2.open.jpg);");
            Ee2_b3.setStyle("-fx-background-image:url('" + im_E2_1_door_close + "')");
            indexs[14] = 0;
        }
    }







    public void E3onAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjKtUtbxcfKf_dBkcaZXq_xDV9DZ5Ko1QJVIhy9OH5X3h2zDTRZnqToyqhjZm1886kjk6lWJnCgwrZwORwNxHXjPuh5BUJdUBXf4uQlHeH6KO6aVm9sIkKnB2xjCMsZYfFgoaQ6cCl7cjBJv8XjzLrPB5ozBHAimPXW3n8yW4kJHRwc02c_ohq1Z8qT/s16000/E-3r.jpg);");
        pane.setStyle("-fx-background-image:url('" + p_E3 + "')");
        b_return.setVisible(true);
        //door_key1.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        E3_open.setVisible(false);
        E3.setVisible(false);
        E_door.setVisible(false);
        E2_b1.setVisible(false);
        E2_b2.setVisible(false);
        E2_b3.setVisible(false);
        E1.setVisible(false);
        if (indexs[11] == 1) {
            Ee3_open.setVisible(true);
        }
        if (indexs[11] == 0) {
            Ee3_close.setVisible(true);
            Ee3_b1.setVisible(true);
            Ee3_b2.setVisible(true);
            Ee3_b3.setVisible(true);
            Ee3_b4.setVisible(true);
        }
    }
    public void Ee3_b1onAction(ActionEvent event) throws IOException {
        E3code[0] = E3code[0] + 1;
        if (E3code[0] ==10){
            E3code[0] = 0;
        }
        if (E3code[0] == E3answer[0]&&E3code[1] == E3answer[1]&&E3code[2] == E3answer[2]&&E3code[3] == E3answer[3]){
            Ee3_b1.setVisible(false);
            Ee3_b2.setVisible(false);
            Ee3_b3.setVisible(false);
            Ee3_b4.setVisible(false);
            indexs[11] = 1;
            door_music();
            Ee3_close.setVisible(false);
            Ee3_open.setVisible(true);

        }
       Ee3_b1.setText(String.valueOf(E3code[0]));
    }
    public void Ee3_b2onAction(ActionEvent event) throws IOException {
        E3code[1] = E3code[1] + 1;
        if (E3code[1] ==10){
            E3code[1] = 0;
        }
        if (E3code[0] == E3answer[0]&&E3code[1] == E3answer[1]&&E3code[2] == E3answer[2]&&E3code[3] == E3answer[3]){
            Ee3_b1.setVisible(false);
            Ee3_b2.setVisible(false);
            Ee3_b3.setVisible(false);
            Ee3_b4.setVisible(false);
            indexs[11] = 1;
            door_music();
            Ee3_close.setVisible(false);
            Ee3_open.setVisible(true);

        }
        Ee3_b2.setText(String.valueOf(E3code[1]));
    }
    public void Ee3_b3onAction(ActionEvent event) throws IOException {
        E3code[2] = E3code[2] + 1;
        if (E3code[2] ==10){
            E3code[2] = 0;
        }
        if (E3code[0] == E3answer[0]&&E3code[1] == E3answer[1]&&E3code[2] == E3answer[2]&&E3code[3] == E3answer[3]){
            Ee3_b1.setVisible(false);
            Ee3_b2.setVisible(false);
            Ee3_b3.setVisible(false);
            Ee3_b4.setVisible(false);
            indexs[11] = 1;
            door_music();
            Ee3_close.setVisible(false);
            Ee3_open.setVisible(true);

        }
        Ee3_b3.setText(String.valueOf(E3code[2]));
    }
    public void Ee3_b4onAction(ActionEvent event) throws IOException {
        E3code[3] = E3code[3] + 1;
        if (E3code[3] ==10){
            E3code[3] = 0;
        }
        if (E3code[0] == E3answer[0]&&E3code[1] == E3answer[1]&&E3code[2] == E3answer[2]&&E3code[3] == E3answer[3]){
            Ee3_b1.setVisible(false);
            Ee3_b2.setVisible(false);
            Ee3_b3.setVisible(false);
            Ee3_b4.setVisible(false);
            indexs[11] = 1;
            door_music();
            Ee3_close.setVisible(false);
            Ee3_open.setVisible(true);

        }
        Ee3_b4.setText(String.valueOf(E3code[3]));
    }








    public void F1onAction(ActionEvent event) throws IOException {
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjr76T-Bf77DPiSgqHcebLHKUDofwLwYTXPtoElUEMpJvjEfqv7PPugKtkGv3LpQFZEcF-vJplTU9_4LmqYlhdTSWcgo32m1gyQ3h6VBo8TwjDQdfWhBt72ql0AVTBhQ4kCAPsC3hegvaII4rhJT7EDVweA-IwDRnYb60T7HUcQ83SwJDgdfik3-3HK/s16000/F-1r.jpg);");
        pane.setStyle("-fx-background-image:url('" + p_F1 + "')");
        F1.setVisible(false);
        F2_b1.setVisible(false);
        F2_b2.setVisible(false);
        F2_b3.setVisible(false);
        F2_b4.setVisible(false);
        F2_door.setVisible(false);
        Ff1.setVisible(true);
        b_return.setVisible(true);
        left.setVisible(false);
        right.setVisible(false);
        if(indexs[16] ==0){
            //Ff1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiQmTwpMB7Wand6mt3JfoAByq2h_fa2irtmxbOHjq_j_WYEoXgoF_qzxafLgdDPt7IGVff-kVaWrGjI_UYs-Yg6GvKnl6nIX5bprhInKFTEVmFkzr_OGHAw-VVtpeoZ1jp6y43UhGwrpepKf9CuAeW3vOSc6alBlAwSV9mVxm0dPt-TH0nKFBJWYB-E/s16000/F-1.close.jpg);");
            Ff1.setStyle("-fx-background-image:url('" + im_F1_1_close + "')");
        }
        if(indexs[16] ==1){
            //Ff1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEherXzmOMRumNwiWUZ4qv9nci5fcP2pLj4BgJbn24d0XZKzJlQN8YeEwztm8jkDCZE9pFCjsUwIMwlauuae8K0CSKi_jtme5k0h0FSMqTDeJUrPwMMM3fMYAC947uhu7K-Tppmg5JmobR-I1CLQQfF1DbYinIybxq96JxnUbYvgr4ZDV8E9JUuJ3mca/s16000/F-1.open.jpg);");
            Ff1.setStyle("-fx-background-image:url('" + im_F1_1_open + "')");
        }

    }
    public void Ff1onAction(ActionEvent event) throws IOException {
            Ff1.setVisible(false);
          //  Ff1f1_b1.setVisible(true);
        //Ff1f1_b2.setVisible(true);
            indexs[17] = 1;
        if(indexs[16] ==0){
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhwRVqbMdaTKetJddEvumpztHx6LnsFyddgPZ4cCXLX0IzsUxCOfmiqlKcfMN7X8crY6dy0R6bVtzlOoOzzdrNnhTPjveh98LL0vS-8GLwszvHn72UeIF4GaBqgxmk6M3jsf84CoYQkWzow2eDKcgl4T8MRQ4VwQBtBnB2oJ9aM9CcPQII2rKc6HTSy/s16000/F-1.1r.jpg);");
            pane.setStyle("-fx-background-image:url('" + p_F1_1_1 + "')");
            Ff1f1_b1.setVisible(true);
            Ff1f1_b2.setVisible(true);
        }
        if(indexs[16] ==1){
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhHbiC4OaFgcgytPplNCFx8edUeHpThcR8lhsirzJ6kQnZyeKDmO2yNMG-ZxhHK6LwBUU27vTgfYDylas3yIImD8fVhtxTbmxsGXfz-xPL9oppCOJeIzbg9_x-LuCYGyih9bCDqW60MTfp8oG2TjTJtsJY7fI_4_pihGAvFIf9LtpAhfWg8y_KCeK48/s16000/F-1.2.png);");
            pane.setStyle("-fx-background-image:url('" + p_F1_1_2 + "')");
        }
    }
    public void Ff1f1_b1onAction(ActionEvent event) throws IOException {
            F1code[0] = F1code[0] + 1;
            if(F1code[0] == 8){
                F1code[0] = 0;
            }
            Ff1f1_b1.setRotate(45*F1code[0]);
            Ff1Operation();
        if(Ff1_mismatch == 0){
           // pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhHbiC4OaFgcgytPplNCFx8edUeHpThcR8lhsirzJ6kQnZyeKDmO2yNMG-ZxhHK6LwBUU27vTgfYDylas3yIImD8fVhtxTbmxsGXfz-xPL9oppCOJeIzbg9_x-LuCYGyih9bCDqW60MTfp8oG2TjTJtsJY7fI_4_pihGAvFIf9LtpAhfWg8y_KCeK48/s16000/F-1.2.png);");
            pane.setStyle("-fx-background-image:url('" + p_F1_1_2 + "')");
            //Ff1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEherXzmOMRumNwiWUZ4qv9nci5fcP2pLj4BgJbn24d0XZKzJlQN8YeEwztm8jkDCZE9pFCjsUwIMwlauuae8K0CSKi_jtme5k0h0FSMqTDeJUrPwMMM3fMYAC947uhu7K-Tppmg5JmobR-I1CLQQfF1DbYinIybxq96JxnUbYvgr4ZDV8E9JUuJ3mca/s16000/F-1.open.jpg);");
            Ff1.setStyle("-fx-background-image:url('" + im_F1_1_open + "')");
            Ff1f1_b1.setVisible(false);
            Ff1f1_b2.setVisible(false);
            indexs[16] = 1;
        }
    }
    public void Ff1f1_b2onAction(ActionEvent event) throws IOException {
        F1code[1] = F1code[1] + 1;
        if(F1code[1] == 8){
            F1code[1] = 0;
        }
        Ff1f1_b2.setRotate(45*F1code[1]);
        Ff1Operation();
        if(Ff1_mismatch == 0){
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhHbiC4OaFgcgytPplNCFx8edUeHpThcR8lhsirzJ6kQnZyeKDmO2yNMG-ZxhHK6LwBUU27vTgfYDylas3yIImD8fVhtxTbmxsGXfz-xPL9oppCOJeIzbg9_x-LuCYGyih9bCDqW60MTfp8oG2TjTJtsJY7fI_4_pihGAvFIf9LtpAhfWg8y_KCeK48/s16000/F-1.2.png);");
            pane.setStyle("-fx-background-image:url('" + p_F1_1_2 + "')");
            //Ff1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEherXzmOMRumNwiWUZ4qv9nci5fcP2pLj4BgJbn24d0XZKzJlQN8YeEwztm8jkDCZE9pFCjsUwIMwlauuae8K0CSKi_jtme5k0h0FSMqTDeJUrPwMMM3fMYAC947uhu7K-Tppmg5JmobR-I1CLQQfF1DbYinIybxq96JxnUbYvgr4ZDV8E9JUuJ3mca/s16000/F-1.open.jpg);");
            Ff1.setStyle("-fx-background-image:url('" + im_F1_1_open + "')");
            Ff1f1_b1.setVisible(false);
            Ff1f1_b2.setVisible(false);
            indexs[16] = 1;
        }
    }









    public void F2onAction(ActionEvent event) throws IOException {
        F1.setVisible(false);
        F2_b1.setVisible(false);
        F2_b2.setVisible(false);
        F2_b3.setVisible(false);
        F2_b4.setVisible(false);
        F2_door.setVisible(false);
        b_return.setVisible(true);
        left.setVisible(false);
        right.setVisible(false);
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj69BpAHO1fim9P9S6kD9Lghtb4gocW_AJ5w-t1o9R2aQ55Gkb00t4m791XjHjAGW6KemcFY5wQxgr2O8fKX_VLS33cKz8g-jgvoGK6zXGNtxXv_1lcTDEyDsTLbw-4MDEIekxNLuDAh2bHZiR1vSzE00Uk4Mq2_eDhDOOkI4HuxXWKcO1NWshql9y7/s16000/F-2.png);");
        pane.setStyle("-fx-background-image:url('" + p_F2 + "')");
        Ff2_b1.setVisible(true);
        Ff2_b2.setVisible(true);
        Ff2_b3.setVisible(true);
        Ff2_b4.setVisible(true);
        if(indexs[18] == 0){
            Ff2_door.setVisible(true);
        }
    }

    public void Ff2_b1onAction(ActionEvent event) throws IOException {
        if(indexs[18]==0) {

            F2code[0] = F2code[0] + 1;
            if (F2code[0] == 8) {
                F2code[0] = 0;
            }
            Ff2_b1.setRotate(45 * F2code[0]);
            Ff2Operation();
            if (Ff2_mismatch == 0) {
                Ff2_door.setVisible(false);
                indexs[18] = 1;
            }
        }
    }
    public void Ff2_b2onAction(ActionEvent event) throws IOException {
        if(indexs[18]==0) {

            F2code[1] = F2code[1] + 1;
            if (F2code[1] == 8) {
                F2code[1] = 0;
            }
            Ff2_b2.setRotate(45 * F2code[1]);
            Ff2Operation();
            if (Ff2_mismatch == 0) {
                Ff2_door.setVisible(false);
                indexs[18] = 1;
            }
        }
    }
    public void Ff2_b3onAction(ActionEvent event) throws IOException {
        if(indexs[18]==0) {

            F2code[2] = F2code[2] + 1;
            if (F2code[2] == 8) {
                F2code[2] = 0;
            }
            Ff2_b3.setRotate(45 * F2code[2]);
            Ff2Operation();
            if (Ff2_mismatch == 0) {
                Ff2_door.setVisible(false);
                indexs[18] = 1;
            }
        }
    }
    public void Ff2_b4onAction(ActionEvent event) throws IOException {
            if(indexs[18]==0) {
                F2code[3] = F2code[3] + 1;
                if (F2code[3] == 8) {
                    F2code[3] = 0;
                }
                Ff2_b4.setRotate(45 * F2code[3]);
                Ff2Operation();
                if (Ff2_mismatch == 0) {
                    Ff2_door.setVisible(false);
                    indexs[18] = 1;
                }
            }
    }





    public void G1_touch_areaonAction(ActionEvent event) throws IOException {
        //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi4kAz5Cb4F5nL3XnIwP3_8o-u6cuMYIGY9EwX1Bp5itvJQjoKJReiRuKlEzHs5h7m_tvKK-gccjBTWo-TK-Q73ksaZzy22E5TmivtV5khE20AzxNKacFUqkE7vIzbOAqfHkIsaasHJB87I2tsiG8vcLwRXJKDBriJbbsY8JxReRvWajkpgNF4HH9v9/s16000/G-1r.jpg);");
        //Ff2_b1.setBackground();
        pane.setStyle("-fx-background-image:url('" + p_G1 + "')");
        left.setVisible(false);
        right.setVisible(false);
        b_return.setVisible(true);
        G1_button.setVisible(false);
        G1_ring1.setVisible(false);
        G1_ring2.setVisible(false);
        G1_ring3.setVisible(false);
        G1_ring4.setVisible(false);
        G1_touch_area.setVisible(false);
        Gg1_b1.setVisible(true);
        Gg1_b2.setVisible(true);
        Gg1_b3.setVisible(true);
        Gg1_b4.setVisible(true);
        Gg1_b_1.setVisible(true);
        Gg1_b_2.setVisible(true);
        Gg1_b_3.setVisible(true);
        Gg1_b_4.setVisible(true);
        //Gg1_door.setVisible(true);
        if(indexs[19] ==0){
            Gg1_door.setVisible(true);
        }
    }
    public void Gg1_b1onAction(ActionEvent event) throws IOException {
        if(indexs[19]==0) {

            G1code[0] = G1code[0] + 1;
            if (G1code[0] == 8) {
                G1code[0] = 0;
            }
            Gg1_b1.setRotate(45 * G1code[0]);
            Gg1Operation();
            if (Gg1_mismatch == 0) {
                Gg1_door.setVisible(false);
                indexs[19] = 1;
            }
        }
    }
    public void Gg1_b2onAction(ActionEvent event) throws IOException {
        if(indexs[19]==0) {

            G1code[1] = G1code[1] + 1;
            if (G1code[1] == 8) {
                G1code[1] = 0;
            }
            Gg1_b2.setRotate(45 * G1code[1]);
            Gg1Operation();
            if (Gg1_mismatch == 0) {
                Gg1_door.setVisible(false);
                indexs[19] = 1;
            }
        }
    }
    public void Gg1_b3onAction(ActionEvent event) throws IOException {
        if(indexs[19]==0) {

            G1code[2] = G1code[2] + 1;
            if (G1code[2] == 8) {
                G1code[2] = 0;
            }
            Gg1_b3.setRotate(45 * G1code[2]);
            Gg1Operation();
            if (Gg1_mismatch == 0) {
                Gg1_door.setVisible(false);
                indexs[19] = 1;
            }
        }
    }
    public void Gg1_b4onAction(ActionEvent event) throws IOException {
        if(indexs[19]==0) {

            G1code[3] = G1code[3] + 1;
            if (G1code[3] == 8) {
                G1code[3] = 0;
            }
            Gg1_b4.setRotate(45 * G1code[3]);
            Gg1Operation();
            if (Gg1_mismatch == 0) {
                Gg1_door.setVisible(false);
                indexs[19] = 1;
            }
        }
    }



    public void H1onAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url('"+p_H1+"')");
        H1.setVisible(false);
        H2.setVisible(false);
        H2_open.setVisible(false);
        H3.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        Hh1_b.setVisible(true);
        b_return.setVisible(true);
        if(indexs [21] == 0){
            Hh1_b.setStyle("-fx-background-image:url('"+im_H1_without+"')");
        }else{
            Hh1_b.setStyle("-fx-background-image:url('"+im_H1_with+"')");
        }
    }
    public void Hh1_bonAction(ActionEvent event) throws IOException {
            indexs[21] = 1;
        Hh1_b.setStyle("-fx-background-image:url('"+im_H1_with+"')");
    }



    public void H2onAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url('"+p_H2+"')");
        H1.setVisible(false);
        H2.setVisible(false);
        H2_open.setVisible(false);
        H3.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        b_return.setVisible(true);
        Hh2_close.setVisible(true);
        Hh2_1_color.setVisible(true);
        Hh2_2_color.setVisible(true);
        Hh2_3_color.setVisible(true);
        Hh2_4_color.setVisible(true);
        Hh2_b1a.setVisible(true);
        Hh2_b1b.setVisible(true);
        Hh2_b2a.setVisible(true);
        Hh2_b2b.setVisible(true);
        Hh2_b3a.setVisible(true);
        Hh2_b3b.setVisible(true);
        Hh2_b4a.setVisible(true);
        Hh2_b4b.setVisible(true);
        if (indexs[20]==0) {
            Hh2_open.setVisible(false);
            Hh2_close.setVisible(true);
        }else {
            Hh2_open.setVisible(true);
            Hh2_close.setVisible(false);
        }

    }
    public void H2_dooronAction(ActionEvent event) throws IOException {
            indexs[20] = 1;
        Hh2_open.setVisible(true);
        Hh2_close.setVisible(false);

    }


    private void Hh2_blink1() {
        Service<String> service = new Service<>() {
            @Override
            protected Task<String> createTask() {
                return new Task<>() {
                    @Override
                    protected String call() throws Exception {
                        updateProgress(0, 5);
                        for (int i = 1; i <= count_blink1*2; i++) {
                            //Thread.sleep(1000);
                            //updateProgress(i, 5);
                            z1++;
                            if(z1%2 == 0) {
                                Hh2_1_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: #b30000;")
                                );
                            }else{
                                Hh2_1_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: transparent;")
                                );
                            }
                            Thread.sleep(500);
                        }
                        z1 = 1;
                        if(u1 == 0){
                            Hh2_b1b.setDisable(false);
                        }else{
                            Hh2_b1a.setDisable(false);
                        }
                        return "Complete!";
                    }
                };
            }
        };
        service.start();
    }
    private void Hh2_blink2() {
        Service<String> service = new Service<>() {
            @Override
            protected Task<String> createTask() {
                return new Task<>() {
                    @Override
                    protected String call() throws Exception {
                        updateProgress(0, 5);
                        for (int i = 1; i <= count_blink2*2; i++) {
                            //Thread.sleep(1000);
                            //updateProgress(i, 5);
                            z2++;
                            if(z2%2 == 0) {
                                Hh2_2_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: #b30000;")
                                );
                            }else{
                                Hh2_2_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: transparent;")
                                );
                            }
                            Thread.sleep(500);
                        }
                        z2 = 1;
                        if(u2 == 0){
                            Hh2_b2b.setDisable(false);
                        }else{
                            Hh2_b2a.setDisable(false);
                        }
                        return "Complete!";
                    }
                };
            }
        };
        service.start();
    }
    private void Hh2_blink3() {
        Service<String> service = new Service<>() {
            @Override
            protected Task<String> createTask() {
                return new Task<>() {
                    @Override
                    protected String call() throws Exception {
                        updateProgress(0, 5);
                        for (int i = 1; i <= count_blink3*2; i++) {
                            //Thread.sleep(1000);
                            //updateProgress(i, 5);
                            z3++;
                            if(z3%2 == 0) {
                                Hh2_3_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: #b30000;")
                                );
                            }else{
                                Hh2_3_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: transparent;")
                                );
                            }
                            Thread.sleep(500);
                        }
                        z3 = 1;
                        if(u3 == 0){
                            Hh2_b3b.setDisable(false);
                        }else{
                            Hh2_b3a.setDisable(false);
                        }
                        return "Complete!";
                    }
                };
            }
        };
        service.start();
    }
    private void Hh2_blink4() {
        Service<String> service = new Service<>() {
            @Override
            protected Task<String> createTask() {
                return new Task<>() {
                    @Override
                    protected String call() throws Exception {
                        updateProgress(0, 5);
                        for (int i = 1; i <= count_blink4*2; i++) {
                            //Thread.sleep(1000);
                            //updateProgress(i, 5);
                            z4++;
                            if(z4%2 == 0) {
                                Hh2_4_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: #b30000;")
                                );
                            }else{
                                Hh2_4_color.styleProperty().bind(
                                        Bindings.concat("-fx-background-color: transparent;")
                                );
                            }
                            Thread.sleep(500);
                        }
                        z4 = 1;
                        if(u4 == 0){
                            Hh2_b4b.setDisable(false);
                        }else{
                            Hh2_b4a.setDisable(false);
                        }
                        return "Complete!";
                    }
                };
            }
        };
        service.start();
    }

    public void Hh2_b1aonAction(ActionEvent event) throws IOException, InterruptedException {
        Hh2_b1b.setDisable(true);
        count_blink1 = 3;
        u1 = 0;
        Hh2_blink1();
    }
    public void Hh2_b1bonAction(ActionEvent event) throws IOException {
        Hh2_b1a.setDisable(true);
        count_blink1 = 8;
        u1 = 1;
        Hh2_blink1();
    }
    public void Hh2_b2aonAction(ActionEvent event) throws IOException {
        Hh2_b2b.setDisable(true);
        count_blink2 = 7;
        u2 = 0;
        Hh2_blink2();
    }
    public void Hh2_b2bonAction(ActionEvent event) throws IOException {
        Hh2_b2a.setDisable(true);
        count_blink2 = 4;
        u2 = 1;
        Hh2_blink2();
    }
    public void Hh2_b3aonAction(ActionEvent event) throws IOException {
        Hh2_b3b.setDisable(true);
        count_blink3 = 9;
        u3 = 0;
        Hh2_blink3();
    }
    public void Hh2_b3bonAction(ActionEvent event) throws IOException {
        Hh2_b3a.setDisable(true);
        count_blink3 = 2;
        u3 = 1;
        Hh2_blink3();
    }
    public void Hh2_b4aonAction(ActionEvent event) throws IOException {
        Hh2_b4b.setDisable(true);
        count_blink4 = 6;
        u4 = 0;
        Hh2_blink4();
    }
    public void Hh2_b4bonAction(ActionEvent event) throws IOException {
        Hh2_b4a.setDisable(true);
        count_blink4 = 1;
        u4 = 1;
        Hh2_blink4();

    }
    public void H3onAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url('"+p_H3+"')");
        H1.setVisible(false);
        H2.setVisible(false);
        H2_open.setVisible(false);
        H3.setVisible(false);
        left.setVisible(false);
        right.setVisible(false);
        b_return.setVisible(true);
        Hh3_b.setVisible(true);
    }
    public void Hh3_bonAction(ActionEvent event) throws IOException {
        pane.setStyle("-fx-background-image:url('"+p_H3_1+"')");
        Hh3_b.setVisible(false);
        indexs[22] =1;
    }

    public void Thing1onAction(ActionEvent event) throws IOException {
            Thing1_a.setVisible(false);
            things[1] = 1;
        help_int = 3;
        inventory_space_check();
        //image1.setLayoutY(815);
        //image1.setVisible(true);
        //image1.setDisable(true);
        if(empty_space == 0) {
            image1.setStyle("-fx-image:url('"+thing1i+"')");
            //inventory1.setText("Key1");
            image1.setVisible(true);
            //image1.setLayoutX(110);
        } else if (empty_space == 1) {
            image2.setStyle("-fx-image:url('"+thing1i+"')");
            //inventory2.setText("Key1");
            image2.setVisible(true);
            //image1.setLayoutX(212);
        } else if (empty_space == 2) {
            image3.setStyle("-fx-image:url('"+thing1i+"')");
            image3.setVisible(true);
        } else if (empty_space == 3) {
            image4.setStyle("-fx-image:url('"+thing1i+"')");
            image4.setVisible(true);
        } else if (empty_space == 4) {
            image5.setStyle("-fx-image:url('"+thing1i+"')");
            image5.setVisible(true);
        } else if (empty_space == 5) {
            image6.setStyle("-fx-image:url('"+thing1i+"')");
            image6.setVisible(true);
        } else if (empty_space == 6) {
            image7.setStyle("-fx-image:url('"+thing1i+"')");
            image7.setVisible(true);
        } else if (empty_space == 7) {
            image8.setStyle("-fx-image:url('"+thing1i+"')");
            image8.setVisible(true);
        } else if (empty_space == 8) {
            image9.setStyle("-fx-image:url('"+thing1i+"')");
            image9.setVisible(true);
        } else if (empty_space == 9) {
            image10.setStyle("-fx-image:url('"+thing1i+"')");
            image10.setVisible(true);
        } else if (empty_space == 10) {
            image11.setStyle("-fx-image:url('"+thing1i+"')");
            image11.setVisible(true);
        } else if (empty_space == 11) {
            image12.setStyle("-fx-image:url('"+thing1i+"')");
            image12.setVisible(true);
        } else if (empty_space == 12) {
            image13.setStyle("-fx-image:url('"+thing1i+"')");
            image13.setVisible(true);
        }
        empty_space = 0;
        help_int = 0;
    }










    public void switchtoMenu(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Mainscene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        //ot.setShape(new Circle(100));
    }

    public void rightButton(ActionEvent event) throws IOException {
        if(room_index == 1){


            pane.setStyle("-fx-background-image:url('"+p_B+"')");

            room_index++;
            door.setVisible(false);
            A1_open.setVisible(false);
            Thing1_A.setVisible(false);
            A1.setVisible(false);
            A2_close.setVisible(false);
            A2_open.setVisible(false);
            Text.setText("B");
            idoor1.setVisible(false);
            A3.setVisible(false);
            A4.setVisible(false);
            A5.setVisible(false);
            B3_im_code1.setVisible(true);
            B3_im_code2.setVisible(true);
            B3_im_code3.setVisible(true);
            Number_code_room_B.setVisible(true);
            if(door_key2_index == 0) {
                door_key2.setVisible(true);
            }
            if(indexs[4] == 0) {
                B1a_close.setVisible(true);
            }
            if(indexs[4] == 1) {
                B1a_close.setVisible(true);
                B1a_open.setVisible(true);
                B1a_close.setStyle("-fx-background-color: transparent;");;
            }
            if(indexs[5] == 1) {
                B1b_close.setVisible(true);
                B1b_open.setVisible(true);
                B1b_close.setStyle("-fx-background-color: transparent;");;
            }
            if(indexs[5] == 0) {
                B1b_close.setVisible(true);
            }
            if(indexs[6] == 0) {
                B3.setVisible(true);
            }
            if(indexs[6] == 1) {
                B3.setVisible(true);
                B3.setStyle("-fx-background-color: transparent;");;
            }
            B2.setVisible(true);
        } else if (room_index == 2) {
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgg3XI01e_ZJNJ2jCMv_vcRhHFS_FVVghZtKyOQMWLdXrTo7xN6d-XmNYoSSwDVnyXqR6hS6HnbN7LWURcl1-AvYnVSt0YLfIMIo-TQoUSzcRYxqalhuPbdFYI-zlO7msGFVJye78UxpDY27OTQ00hW_Yl4Lx5ZoGOezP0Td2KupAlxE6J-rHeglkRU4g/s16000/ata1.jpg);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjY1Gb6zVn3c7JsLaIHx9VHbccKoGa7HoL2iv-omqOogaKF9N93E8oaDbAUVdmAYhH9DJc0ynBGTphDFZ0A2qAh7eqMC4tkhViuKJL9t_r9_sjpr7yXMBZIL4MX9FFpckRdz4Gljm8vnIkd3WUhX2x4IIF_14hr4rHWVirBN7VZZjzTLcqIUgT8bju-/s16000/C.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjT1CBOiHGi-zPEYzOpecgLHzvzQxAeswWSsrFxcmebl7Kh8vxdBnZt-n7Wwc_vh0Rh02RobghyqwQdz2MtKnVpHjyD4_oNes48fIEqb4_84SL01aKvSnPUSL86uYSxQlA1VGjAgHC0q24l2_5kCSddqBMOOdwzDoHU8s0mnrG29dqKQd1bhSRKQJo7/s16000/Cr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_C+"')");
            room_index++;
            Text.setText("C");
            door_key2.setVisible(false);
            B1a_close.setVisible(false);
            B1b_close.setVisible(false);
            B1a_open.setVisible(false);
            B1b_open.setVisible(false);
            B3_im_code1.setVisible(false);
            B3_im_code2.setVisible(false);
            B3_im_code3.setVisible(false);
            Number_code_room_B.setVisible(false);
            B2.setVisible(false);
            B3.setVisible(false);
            C1_b1.setVisible(true);
            C1_b2.setVisible(true);
            C1_b3.setVisible(true);
            C1_b4.setVisible(true);
            C1_b5.setVisible(true);
            C1_b6.setVisible(true);
            C1_b7.setVisible(true);
            C1_b8.setVisible(true);
            C1_b9.setVisible(true);
            C3.setVisible(true);
            C2.setVisible(true);
            C4.setVisible(true);
            if(indexs[10] == 0) {
                C_door.setVisible(true);
            }
            if(indexs[10] == 1) {
                C_door_open.setVisible(true);
                C_door.setVisible(true);
                C_door.setStyle("-fx-background-color: transparent;");
            }
            /*C1_b1.setStyle(Cc1_b1.getStyle());
            C1_b2.setStyle(Cc1_b2.getStyle());
            C1_b3.setStyle(Cc1_b3.getStyle());
            C1_b4.setStyle(Cc1_b4.getStyle());
            C1_b5.setStyle(Cc1_b5.getStyle());
            C1_b6.setStyle(Cc1_b6.getStyle());
            C1_b7.setStyle(Cc1_b7.getStyle());
            C1_b8.setStyle(Cc1_b8.getStyle());
            C1_b9.setStyle(Cc1_b9.getStyle());*/

            if(indexs[7] == 0) {
                C1_door.setVisible(true);
            }
            if(door_key1_index == 0) {
                door_key1.setVisible(true);
            }
        } else if (room_index == 3) {
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgg3XI01e_ZJNJ2jCMv_vcRhHFS_FVVghZtKyOQMWLdXrTo7xN6d-XmNYoSSwDVnyXqR6hS6HnbN7LWURcl1-AvYnVSt0YLfIMIo-TQoUSzcRYxqalhuPbdFYI-zlO7msGFVJye78UxpDY27OTQ00hW_Yl4Lx5ZoGOezP0Td2KupAlxE6J-rHeglkRU4g/s16000/ata1.jpg);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjYB4OlvnksJH2653qEriZseztLvBPNlpow9953rxEhPcplBsc4T1Blgkry5emw7XauT7AwdVfxKkLOEFAO5gyzPI3QYUddnrSYBl0d_3J5gncq_9Jlz4hvmwiDt0bh1UwSJQniOr5Clxjr-m_eVDfHuM_C6-aY9L4r7p8O0YIG1xcRJpnj6rg2F-PH/s16000/D.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZNn9goV3k2uOhBsSbjow8HLzgco7PT05fsNV9VgSLKLVFa5bgCEQF0161axPbAE8TbFP3saisdD2JKwp1q7xZ5D4zu9H0dqsK-uuUQw1gvP7QmOeQ6B1d2L9n4fGxI91GnYHI-YyFeZGMJsUyXmJ7W63bij_IIPU15QtJzcc8DXP3j29CJKxg_izs/s16000/Dr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_D+"')");
            room_index++;
            Text.setText("D");
            door_key1.setVisible(false);
            C1_b1.setVisible(false);
            C1_b2.setVisible(false);
            C1_b3.setVisible(false);
            C1_b4.setVisible(false);
            C1_b5.setVisible(false);
            C1_b6.setVisible(false);
            C1_b7.setVisible(false);
            C1_b8.setVisible(false);
            C1_b9.setVisible(false);
            C1_door.setVisible(false);
            C3.setVisible(false);
            C2.setVisible(false);
            C4.setVisible(false);
            C_door.setVisible(false);
            C_door_open.setVisible(false);
            D1.setVisible(true);
            if(indexs[8] == 0) {
                //D1.setVisible(true);
                //D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhPLHSd57nFuYSEslqTKdOVKl3Y3if38SflU12fq_1MY60OOVqeOglW6EJyC75Z01MtC3vfBZkuy07yE9OkH5OicpspbUu9T6A7Qe_Z1snS5qyP27xXAmr4sjhtAKulzThHkSnfRtzJJT59V5RCuNcOw50Q426eV197Xuc7RdgKf6eLc858349ov3q9/s16000/D1.close.jpg);");
                D1.setStyle("-fx-background-image:url('"+im_D1_close+"')");
            }
            if(indexs[8] == 1) {
                //D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjW-ZSyNc-pLGJ11zUc4YKjhuU6ULOUuKmx67DlBycIMUZAk4Cz4QsfE17prX8oeL3_-mN1-QVy4HQOyrhwlqLTkrJvI4P2j-zQQ8ivil8u7Rrrrnpu7aJXHKtBP_ew-WcLXyHskKHVfyHQ1OmP6iLe1lbRPNNudjfEnYBX8Vorl-9ZAA4NyKm2sqK3/s1600/D1.open.jpg);");
                D1.setStyle("-fx-background-image:url('"+im_D1_open+"')");
            }
        } else if (room_index == 4) {
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLigvc_Qa2JJzDoqtOr2auuXrPZy7CW0bjbbw2wjdqHgz3df-Du3SqToRbfeOGHKdoZZ0SFT6hbgdDNpc-aIHn_K1lXKBQ3LC9KpRRcjz_ETsjoO_idBY20KFa0zFtBe8iUvAXk3POlGnLgIdZB0TdTs_XqMt9yTKACw8Rb1M2uY_XpjHK6WNXlTamuw/s16000/ata.jpg);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiaoUleIr_flTUQiihgbFaf0WjBvgcpp60xH8ZX2OTVCbvDCvkTLRoODdAEIJ9qys-RMgu9NNrhYwd218t4P-Sy6TEDDT3dlYPc34zlWSNOy6snulsGThnr9f8qSbat_wzbEdkGMD6sE56VHeThoVvivE8BVBHkKzXGdsXSAriUsecUk5tmsJkWOCOi/s16000/A.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg1fiYNSLo6kbFfcW4oayKGYo_h5_6FlqiRTTWQoMztm_J7ZyJTv1TglUB05DXuTj9TzX6ER67GP0Wa2-dsFHOKP3rW59OTOy1JRLACZIUePtXKwYDMUaY0iz6BJXLzCLyZUNUcCf8cf3ommScy68Kw8SnYAjr7NLYZQxnR3alhHPjUXObujeLpqsHA/s16000/Ar.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_A+"')");

            room_index = 1;
            door.setVisible(true);
            D1.setVisible(false);
            Text.setText("A");
            A3.setVisible(true);
            A4.setVisible(true);
            A5.setVisible(true);
            if(things[1]==0){
                Thing1_A.setVisible(true);
            }
            if(door1_index == 0) {
                idoor1.setVisible(true);
            }
            if(indexs[1] == 1) {
                A2_open.setVisible(true);
                A2_close.setVisible(true);
                A2_close.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[1] == 0) {
                A2_close.setVisible(true);
            }

            if(indexs[3] == 1) {
                A1_open.setVisible(true);
                A1.setVisible(true);
                A1.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[3] == 0 || indexs[3] == 2) {
                A1.setVisible(true);
            }
        } else if (room_index == 5) {
            Text.setText("F");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgAML7weYa6TuQMC13YlUTdebq75owy5NmeoKTamiEUaSYW349JqXwfSAZC2Q2_ZBmFasHmuyQe57NZZIH_2wRpUwJoWvB57jBYKD5B-oEUMxO32buFAx3HIhzB7Wl5jnQzgYwgZP9yHP7dLGRlCxb8dOQFoOWqyCp0c9iiM12G9BX8K-qjuzCQLM6h/s16000/F.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEicrBqU2i5CUgUCsuW7YltDlmrx35fdxtUMB1BEkvHbHQC6Is36NlI6Zw0mgAIJ_BZnaYiScwzA9qxZuJYGmFZGltmhtmdxbJXOvpXMApVu593PSAjSH0udttLzz2C4iYfTdnCBHFSHjQ_LjP3ssdIfDlOBiu2LyLgdJfNG_kvda6x3Syhp1j5ncWur/s16000/Fr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_F+"')");
            room_index++;
            E_door.setVisible(false);
            E3_open.setVisible(false);
            E3.setVisible(false);
            E2_b1.setVisible(false);
            E2_b2.setVisible(false);
            E2_b3.setVisible(false);
            E1.setVisible(false);
            F1.setVisible(true);
            F2_b1.setVisible(true);
            F2_b2.setVisible(true);
            F2_b3.setVisible(true);
            F2_b4.setVisible(true);
            F2_door.setVisible(true);
            if(indexs[18] ==1){
                F2_door.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[16] ==0){
                //F1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiarg4BWLmfWHamA4KNseitPyZ7d7xyMuynpjWa5URGEnTCGUwdqxL15ZoWWGCQePZlMWlW3mHSP8sZ4WCYDSQpC57Qw6oStlwrlDPj48exCwDeUfr7t7gTpBkOcHpC-glA-esyicuAyL_OL6t_8uB5uvWaXE3RpQUD3XvnJ8YsWNIFMHQRK5MIdsvu/s1600/F1.close.jpg);");
                F1.setStyle("-fx-background-image:url('"+p_F1_close+"')");
            }
            if(indexs[16] ==1){
                //F1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhNtNyT2QdkZaUSbdTSclgvPRE4KAMCY24FU4xQgeGba8bx3W6Gr_UuktkjHzyas6hqzTgO4YUclLaQIfISHhyZgYSC-v7B9pnRFKdWD8lP-0C16wMdKkS1NJl80v5eetz2VveS4dPFzXvV0mMSiMLcIGDTCqRNs1tgzPxJ_C78GpeLZ7UkG1VYNj3R/s1600/F1.open.jpg);");
                F1.setStyle("-fx-background-image:url('"+p_F1_open+"')");
            }
        } else if (room_index == 6){
            Text.setText("G");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhHvaGDXISIi9GWjgBpZRrSrF0U649LLaO5s2d5FWAY9OpgD5q9KObPxn3aCahYMDLIuXOY1_Vn4K7LqVYKqmBCeNR6-dYpfsTAPYmfDXOAXB_T8kY9EZJoFWUyr530qNgnxMlSMwKatkSOkiieOQ4-n3yVFGd0EoiZQWj8sCqczNcQKYClZTOZRG-h/s16000/G.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZ7Asw0F_OdvD0kVvgHO9B5v-n7iVoz-ElJdfDUVdwEWqMb9T85XSEuYK_094ArFGIwiqib7qH0Fl9xKhS3N_1H0806b8ociZOAiGr5ecAHx7u1flUbP4JpSwtLNDH2ks8cfFWGM8fLx7uX2PKhTEAEtlTudw0Zg5wUIpYlLF42pnE7i-kpWR0Rmm6/s16000/Gr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_G+"')");
            F1.setVisible(false);
            F2_b1.setVisible(false);
            F2_b2.setVisible(false);
            F2_b3.setVisible(false);
            F2_b4.setVisible(false);
            F2_door.setVisible(false);
            G1_button.setVisible(true);
            G1_ring1.setVisible(true);
            G1_ring2.setVisible(true);
            G1_ring3.setVisible(true);
            G1_ring4.setVisible(true);
            G1_touch_area.setVisible(true);
            if(indexs[19] ==1){
                G1_button.setStyle("-fx-background-color: transparent;");
            }
            room_index++;
        } else if (room_index == 7){
            Text.setText("H");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh8zb_v-xS3zGhxf0foDXwJxxrISFO3EPjtkeumIQFr1hphTS4ndoobDZfQ8x9yHqHue4HYeC4nb_Ix9HHgffo-sctjGHPjT8gAu3ROe9c8bTV_V6qF6Oj2ekruKJvyIjp9HRBX7o2_usiS0pm5Qtk12Do5PSWQrA66RM56gAkYNzLayUzfPPTZfx71/s16000/H.png);");
            pane.setStyle("-fx-background-image:url('" + p_H + "')");
            room_index++;
            G1_button.setVisible(false);
            G1_ring1.setVisible(false);
            G1_ring2.setVisible(false);
            G1_ring3.setVisible(false);
            G1_ring4.setVisible(false);
            G1_touch_area.setVisible(false);
            H1.setVisible(true);
            H2.setVisible(true);
            H2_open.setVisible(true);
            H3.setVisible(true);
            /*if(indexs[20] == 0) {
                H2.setVisible(true);
            }*/
            if(indexs[20] == 1) {
             H2_open.setVisible(true);
             H2.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[20] == 0) {
                H2_open.setVisible(false);
            }
        }else if (room_index == 8){
            Text.setText("E");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjjOkvo_NfEdH7cmM9jdwKx4KbpxlJwdIr7UBSMfsWmtw6TmrPFCFK9JMbOhgub_WbBwjCrnnadhftJJn4A-M69LUoe67nigce56xn0f1LpjkOzALTEiJhU8MtvnF403z3AZskIBVSTk0IL05ljFyhdkE2jmr3ZbkqZHdQGtGr2jOSAgAWFKUHUUkVM/s16000/E.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi4QxtymjIL87C98SFcKso-D179iBrwInfzJBpeHn2VvKD116_cpmkwZh8SsnIRlgyukr4YLdITDUuEG-ebAsJVlbHVAxsDD1j6izxvga7tLwcZMaM4aSv9tIaa2YkwUvj79wrmGGwb07hlswYJlLmxpX-bvhg4hJMEy4v1Ypf1Be__Lxjy_gONeg9x/s16000/Er.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_E+"')");
            room_index = 5;
            E_door.setVisible(true);
            E2_b1.setVisible(true);
            E2_b2.setVisible(true);
            E2_b3.setVisible(true);
            E1.setVisible(true);
            H1.setVisible(false);
            H2.setVisible(false);
            H2_open.setVisible(false);
            H3.setVisible(false);
            if(indexs[12] == 0) {
                //E2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                E2_b1.setStyle("-fx-background-image:url('"+im_E2_close+"')");
            }
            if(indexs[12] == 1) {
                //E2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                E2_b1.setStyle("-fx-background-image:url('"+im_E2_open+"')");
            }
            if(indexs[13] == 0) {
                //E2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                E2_b2.setStyle("-fx-background-image:url('"+im_E2_close+"')");
            }
            if(indexs[13] == 1) {
                //E2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                E2_b2.setStyle("-fx-background-image:url('"+im_E2_open+"')");
            }
            if(indexs[14] == 0) {
                //E2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                E2_b3.setStyle("-fx-background-image:url('"+im_E2_close+"')");
            }
            if(indexs[14] == 1) {
                //E2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                E2_b3.setStyle("-fx-background-image:url('"+im_E2_open+"')");
            }
            if(indexs[11] == 1) {
                E3_open.setVisible(true);
                E3.setVisible(true);
                E3.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[11] == 0) {
                E3.setVisible(true);
            }
            if(indexs[15] == 0) {
                //E1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiwVIk40oPwraBqKbzPSOUFi33kxxBC9N1jUfdflwNUFNKK6lZtTFnvAJfk3nTj4p05L_r8L14RFrQglCVehr280R3SsbzUlOZfnTCUjizz4BL1yictvQZNFd489Le3Q5cAB7xf4F_WXtcgTT87hEMfsgIaypYkNZIb2A40yksw2QD8ZJ8XcMdaQ5dZ/s16000/E1.close.jpg);");
                E1.setStyle("-fx-background-image:url('"+im_E1_close+"')");
            }
            if(indexs[15] == 1) {
                //E1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgMjz07RnKkBl-EAfJq-E4HVwvipr5m17mfeQm1L0TNmKKcxK0a0Z0yIba1VoNZshBQWEHpKgX8P6a6PxfKTAxGGvyjjUzhtsTXgdYgBrswGAcxMPKHE-bFF5gnlcTl1X3M78B2DnKMuwANyNp16ImZDPS8Y_fD4yPd72oO6-TXPZn1m6rs4c9CitWh/s1600/E1.open.jpg);");
                E1.setStyle("-fx-background-image:url('"+im_E1_open+"')");
            }
        }

    }

    public void returnButton(ActionEvent event) throws IOException {
            if(room_index == 1){
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg1fiYNSLo6kbFfcW4oayKGYo_h5_6FlqiRTTWQoMztm_J7ZyJTv1TglUB05DXuTj9TzX6ER67GP0Wa2-dsFHOKP3rW59OTOy1JRLACZIUePtXKwYDMUaY0iz6BJXLzCLyZUNUcCf8cf3ommScy68Kw8SnYAjr7NLYZQxnR3alhHPjUXObujeLpqsHA/s16000/Ar.jpg);");
                pane.setStyle("-fx-background-image:url('"+p_A+"')");
                door.setVisible(true);
                door_key2.setVisible(false);
                A3.setVisible(true);
                A4.setVisible(true);
                A5.setVisible(true);
                if(things[1]==0){
                    Thing1_A.setVisible(true);
                }
                if(door1_index == 0) {
                    idoor1.setVisible(true);
                }
                if(indexs[1] == 1) {
                    A2_open.setVisible(true);
                    A2_close.setVisible(true);
                    A2_close.setStyle("-fx-background-color: transparent;");
                }
                if(indexs[1] == 0) {
                    A2_close.setVisible(true);
                }

                if(indexs[3] == 1) {
                    A1_open.setVisible(true);
                    A1.setVisible(true);
                    A1.setStyle("-fx-background-color: transparent;");
                }
                if(indexs[3] == 0 || indexs[3] == 2 ) {
                    A1.setVisible(true);
                }
                if(indexs[24] == 1){
                    A5.setStyle("-fx-background-image:url('"+im_A5_open+"')");
                }
            }else if (room_index == 2){
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiV1alZO4WqP6m7gawhxRELZrVvEPM3wjbLSeeoX08D69s4wstv2cdxNNaCUD2LJLVflea_OU_pBQjBB0Z_CV5ovnPkHwswcs1x8thxDGlRKg4umU-34mCcq_ZsPCIGvWb_v9uoiabzin-meFVScqGq4eFhsCv-1554ntoE-T6olrMhBxEVG9Y6J2xs/s16000/Br.jpg);");
                pane.setStyle("-fx-background-image:url('"+p_B+"')");
                B2.setVisible(true);
                if(indexs[4] == 0) {
                    B1a_close.setVisible(true);
                }
                if(indexs[5] == 0) {
                    B1b_close.setVisible(true);
                }
                if(indexs[4] == 1) {
                    B1a_close.setVisible(true);
                    B1a_open.setVisible(true);
                    B1a_close.setStyle("-fx-background-color: transparent;");;
                }
                if(indexs[5] == 1) {
                    B1b_close.setVisible(true);
                    B1b_open.setVisible(true);
                    B1b_close.setStyle("-fx-background-color: transparent;");;
                }
                if(indexs[6] == 0) {
                    B3.setVisible(true);

                    if (Bb3_press[0] == 1) {
                        Bb3_press[0] = 0;
                        translate1.setByY(300);
                        translate1.play();
                    }
                    if (Bb3_press[1] == 1) {
                        Bb3_press[1] = 0;
                        translate2.setByY(300);
                        translate2.play();
                    }
                    if (Bb3_press[2] == 1) {
                        Bb3_press[2] = 0;
                        translate3.setByY(300);
                        translate3.play();
                    }
                    if (Bb3_press[3] == 1) {
                        Bb3_press[3] = 0;
                        translate4.setByY(300);
                        translate4.play();
                    }
                    if (Bb3_press[4] == 1) {
                        Bb3_press[4] = 0;
                        translate5.setByY(-300);
                        translate5.play();
                    }
                    if (Bb3_press[5] == 1) {
                        Bb3_press[5] = 0;
                        translate6.setByY(-300);
                        translate6.play();
                    }
                    if (Bb3_press[6] == 1) {
                        Bb3_press[6] = 0;
                        translate7.setByY(-300);
                        translate7.play();
                    }
                    if (Bb3_press[7] == 1) {
                        Bb3_press[7] = 0;
                        translate8.setByY(-300);
                        translate8.play();
                    }
                    Bb3_count = 0;
                }
                if(indexs[6] == 1) {
                    B3.setVisible(true);
                    B3.setStyle("-fx-background-color: transparent;");;
                }
                B3_im_code1.setVisible(true);
                B3_im_code2.setVisible(true);
                B3_im_code3.setVisible(true);
                Number_code_room_B.setVisible(true);
            }else if(room_index == 3){
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjT1CBOiHGi-zPEYzOpecgLHzvzQxAeswWSsrFxcmebl7Kh8vxdBnZt-n7Wwc_vh0Rh02RobghyqwQdz2MtKnVpHjyD4_oNes48fIEqb4_84SL01aKvSnPUSL86uYSxQlA1VGjAgHC0q24l2_5kCSddqBMOOdwzDoHU8s0mnrG29dqKQd1bhSRKQJo7/s16000/Cr.jpg);");
                pane.setStyle("-fx-background-image:url('"+p_C+"')");
                if(door_key1_index == 0) {
                    door_key1.setVisible(true);
                }
                C1_b1.setVisible(true);
                C1_b2.setVisible(true);
                C1_b3.setVisible(true);
                C1_b4.setVisible(true);
                C1_b5.setVisible(true);
                C1_b6.setVisible(true);
                C1_b7.setVisible(true);
                C1_b8.setVisible(true);
                C1_b9.setVisible(true);
                C3.setVisible(true);
                C2.setVisible(true);
                C4.setVisible(true);
                if(indexs[10] == 0) {
                    C_door.setVisible(true);
                }
                if(indexs[10] == 1) {
                    C_door_open.setVisible(true);
                    C_door.setVisible(true);
                    C_door.setStyle("-fx-background-color: transparent;");
                }
                /*C1_b1.setStyle(Cc1_b1.getStyle());
                C1_b2.setStyle(Cc1_b2.getStyle());
                C1_b3.setStyle(Cc1_b3.getStyle());
                C1_b4.setStyle(Cc1_b4.getStyle());
                C1_b5.setStyle(Cc1_b5.getStyle());
                C1_b6.setStyle(Cc1_b6.getStyle());
                C1_b7.setStyle(Cc1_b7.getStyle());
                C1_b8.setStyle(Cc1_b8.getStyle());
                C1_b9.setStyle(Cc1_b9.getStyle());*/
                if(indexs[7] == 0 ){
                    C1_door.setVisible(true);
                }
                Cc3_code = 0;
                Cc3_rounds = 1;
                Cc3_text.setText(null);
                if(Cc2_press == 1) {
                    translate11.setByY(300);
                    translate11.setNode(Cc2_b);
                    translate11.play();
                    Cc2_press =0;
                }
                if(Cc4_press == 1) {
                    translate12.setByY(300);
                    translate12.setNode(Cc4_b);
                    translate12.play();
                    Cc4_press =0;
                }
                if (Cc1code[0][0] == 0) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[0][0] == 1) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[0][0] == 2) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[0][0] == 3) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[0][0] == 4) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[0][0] == 5) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[0][0] == 6) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[0][0] == 7) {
                    C1_b1.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b1.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[0][1] == 0) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[0][1] == 1) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[0][1] == 2) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[0][1] == 3) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[0][1] == 4) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[0][1] == 5) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[0][1] == 6) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[0][1] == 7) {
                    C1_b2.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b2.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[0][2] == 0) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[0][2] == 1) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[0][2] == 2) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[0][2] == 3) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[0][2] == 4) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[0][2] == 5) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[0][2] == 6) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[0][2] == 7) {
                    C1_b3.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b3.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[1][0] == 0) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[1][0] == 1) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[1][0] == 2) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[1][0] == 3) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[1][0] == 4) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[1][0] == 5) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[1][0] == 6) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[1][0] == 7) {
                    C1_b4.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b4.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[1][1] == 0) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[1][1] == 1) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[1][1] == 2) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[1][1] == 3) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[1][1] == 4) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[1][1] == 5) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[1][1] == 6) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[1][1] == 7) {
                    C1_b5.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b5.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[1][2] == 0) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[1][2] == 1) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[1][2] == 2) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[1][2] == 3) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[1][2] == 4) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[1][2] == 5) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[1][2] == 6) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[1][2] == 7) {
                    C1_b6.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b6.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[2][0] == 0) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[2][0] == 1) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[2][0] == 2) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[2][0] == 3) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[2][0] == 4) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[2][0] == 5) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[2][0] == 6) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[2][0] == 7) {
                    C1_b7.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b7.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[2][1] == 0) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[2][1] == 1) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[2][1] == 2) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[2][1] == 3) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[2][1] == 4) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[2][1] == 5) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[2][1] == 6) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[2][1] == 7) {
                    C1_b8.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b8.setStyle("-fx-background-color: transparent;");
                }
                if (Cc1code[2][2] == 0) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_1 + "')");
                } else if (Cc1code[2][2] == 1) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_2 + "')");
                } else if (Cc1code[2][2] == 2) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_3 + "')");
                } else if (Cc1code[2][2] == 3) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_4 + "')");
                } else if (Cc1code[2][2] == 4) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_5 + "')");
                } else if (Cc1code[2][2] == 5) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_6 + "')");
                } else if (Cc1code[2][2] == 6) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_7 + "')");
                } else if (Cc1code[2][2] == 7) {
                    C1_b9.setStyle("-fx-background-image:url('" + im_C1_8 + "')");
                } else {
                    C1_b9.setStyle("-fx-background-color: transparent;");
                }
            }else if (room_index == 4){
                if(indexs[9] == 0) {
                    //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZNn9goV3k2uOhBsSbjow8HLzgco7PT05fsNV9VgSLKLVFa5bgCEQF0161axPbAE8TbFP3saisdD2JKwp1q7xZ5D4zu9H0dqsK-uuUQw1gvP7QmOeQ6B1d2L9n4fGxI91GnYHI-YyFeZGMJsUyXmJ7W63bij_IIPU15QtJzcc8DXP3j29CJKxg_izs/s16000/Dr.jpg);");
                    pane.setStyle("-fx-background-image:url('"+p_D+"')");
                    D1.setVisible(true);
                    if (indexs[8] == 0) {

                        //D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhPLHSd57nFuYSEslqTKdOVKl3Y3if38SflU12fq_1MY60OOVqeOglW6EJyC75Z01MtC3vfBZkuy07yE9OkH5OicpspbUu9T6A7Qe_Z1snS5qyP27xXAmr4sjhtAKulzThHkSnfRtzJJT59V5RCuNcOw50Q426eV197Xuc7RdgKf6eLc858349ov3q9/s16000/D1.close.jpg);");
                       D1.setStyle("-fx-background-image:url('"+im_D1_close+"')");
                    }
                    if(indexs[8] == 1) {

                        //D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjW-ZSyNc-pLGJ11zUc4YKjhuU6ULOUuKmx67DlBycIMUZAk4Cz4QsfE17prX8oeL3_-mN1-QVy4HQOyrhwlqLTkrJvI4P2j-zQQ8ivil8u7Rrrrnpu7aJXHKtBP_ew-WcLXyHskKHVfyHQ1OmP6iLe1lbRPNNudjfEnYBX8Vorl-9ZAA4NyKm2sqK3/s1600/D1.open.jpg);");
                        D1.setStyle("-fx-background-image:url('"+im_D1_open+"')");
                    }
                }
                if(indexs[9]== 1){
                    //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhtHi3j0_OlvgSWHO62K5k-EqA2hWRTjBx6qSfsQAhwO5pZCyFbUspXlFg8AvTwbu_f0FRbh4b2LJSQ0Xgeauefk3jQt2SmvDZ9fpyoxJbeyW2vnhFKccfZJVltjz4NAPv0sjpaPTrCSKSOALOutR3WcwbsR-O_gBe_b-JCA3znGSE_R-lxT5e6d3oP/s16000/D-1r.jpg);");
                    pane.setStyle("-fx-background-image:url('"+p_D1+"')");
                    b_return.setVisible(true);
                    //door_key1.setVisible(false);
                    left.setVisible(false);
                    D1.setVisible(false);
                    Dd1.setVisible(true);
                    //indexs[9] = 0;
                    if(indexs[8] == 1) {
                        //Dd1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjW_6rGrrPyFvTuLyZ32CPkzrYDKDYXUhCawvKCp3Mr3ekbFZWMGKfWNO4jdr13K1UuBjxxXZLmwR9VFWiyJi1pmCu4Va2acxJ6NYRHZ6L6X20OZYyrJcq3sskcjgOJfv8-VV-T8eCShIPo13AQFSmQMjmFYehhr8RXw--98nhiBkefK63Kk6s5ZbT0/s16000/D-1.open.jpg);");
                        Dd1.setStyle("-fx-background-image:url('"+im_D1_1_open+"')");
                    }

                }
                /*if(indexs[8] == 1) {
                    D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjW-ZSyNc-pLGJ11zUc4YKjhuU6ULOUuKmx67DlBycIMUZAk4Cz4QsfE17prX8oeL3_-mN1-QVy4HQOyrhwlqLTkrJvI4P2j-zQQ8ivil8u7Rrrrnpu7aJXHKtBP_ew-WcLXyHskKHVfyHQ1OmP6iLe1lbRPNNudjfEnYBX8Vorl-9ZAA4NyKm2sqK3/s1600/D1.open.jpg);");
                }*/
                /*if(indexs[8] == 0) {
                    //D1.setVisible(true);
                    D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhPLHSd57nFuYSEslqTKdOVKl3Y3if38SflU12fq_1MY60OOVqeOglW6EJyC75Z01MtC3vfBZkuy07yE9OkH5OicpspbUu9T6A7Qe_Z1snS5qyP27xXAmr4sjhtAKulzThHkSnfRtzJJT59V5RCuNcOw50Q426eV197Xuc7RdgKf6eLc858349ov3q9/s16000/D1.close.jpg);");
                }*/
            }else if (room_index == 5) {
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi4QxtymjIL87C98SFcKso-D179iBrwInfzJBpeHn2VvKD116_cpmkwZh8SsnIRlgyukr4YLdITDUuEG-ebAsJVlbHVAxsDD1j6izxvga7tLwcZMaM4aSv9tIaa2YkwUvj79wrmGGwb07hlswYJlLmxpX-bvhg4hJMEy4v1Ypf1Be__Lxjy_gONeg9x/s16000/Er.jpg);");
                pane.setStyle("-fx-background-image:url('"+p_E+"')");
                E2_b1.setVisible(true);
                E2_b2.setVisible(true);
                E2_b3.setVisible(true);
                E_door.setVisible(true);
                E1.setVisible(true);
                if(indexs[11] == 1) {
                    E3_open.setVisible(true);
                    E3.setVisible(true);
                    E3.setStyle("-fx-background-color: transparent;");
                }
                if(indexs[11] == 0) {
                    E3.setVisible(true);
                }
                if(indexs[12] == 0) {
                    //E2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                    E2_b1.setStyle("-fx-background-image:url('"+im_E2_close+"')");
                }
                if(indexs[12] == 1) {
                    //E2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                    E2_b1.setStyle("-fx-background-image:url('"+im_E2_open+"')");
                }
                if(indexs[13] == 0) {
                   // E2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                    E2_b2.setStyle("-fx-background-image:url('"+im_E2_close+"')");
                }
                if(indexs[13] == 1) {
                    //E2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                    E2_b2.setStyle("-fx-background-image:url('"+im_E2_open+"')");
                }
                if(indexs[14] == 0) {
                    //E2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                    E2_b3.setStyle("-fx-background-image:url('"+im_E2_close+"')");
                }
                if(indexs[14] == 1) {
                    //E2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                    E2_b3.setStyle("-fx-background-image:url('"+im_E2_open+"')");
                }
                if(indexs[15] == 0) {
                    //E1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiwVIk40oPwraBqKbzPSOUFi33kxxBC9N1jUfdflwNUFNKK6lZtTFnvAJfk3nTj4p05L_r8L14RFrQglCVehr280R3SsbzUlOZfnTCUjizz4BL1yictvQZNFd489Le3Q5cAB7xf4F_WXtcgTT87hEMfsgIaypYkNZIb2A40yksw2QD8ZJ8XcMdaQ5dZ/s16000/E1.close.jpg);");
                    E1.setStyle("-fx-background-image:url('"+im_E1_close+"')");
                }
                if(indexs[15] == 1) {
                    //E1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgMjz07RnKkBl-EAfJq-E4HVwvipr5m17mfeQm1L0TNmKKcxK0a0Z0yIba1VoNZshBQWEHpKgX8P6a6PxfKTAxGGvyjjUzhtsTXgdYgBrswGAcxMPKHE-bFF5gnlcTl1X3M78B2DnKMuwANyNp16ImZDPS8Y_fD4yPd72oO6-TXPZn1m6rs4c9CitWh/s1600/E1.open.jpg);");
                    E1.setStyle("-fx-background-image:url('"+im_E1_open+"')");
                }
            }else if (room_index == 6) {
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEicrBqU2i5CUgUCsuW7YltDlmrx35fdxtUMB1BEkvHbHQC6Is36NlI6Zw0mgAIJ_BZnaYiScwzA9qxZuJYGmFZGltmhtmdxbJXOvpXMApVu593PSAjSH0udttLzz2C4iYfTdnCBHFSHjQ_LjP3ssdIfDlOBiu2LyLgdJfNG_kvda6x3Syhp1j5ncWur/s16000/Fr.jpg);");
                pane.setStyle("-fx-background-image:url('"+p_F+"')");
                if(indexs[16] ==0){
                   // F1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiarg4BWLmfWHamA4KNseitPyZ7d7xyMuynpjWa5URGEnTCGUwdqxL15ZoWWGCQePZlMWlW3mHSP8sZ4WCYDSQpC57Qw6oStlwrlDPj48exCwDeUfr7t7gTpBkOcHpC-glA-esyicuAyL_OL6t_8uB5uvWaXE3RpQUD3XvnJ8YsWNIFMHQRK5MIdsvu/s1600/F1.close.jpg);");
                    F1.setStyle("-fx-background-image:url('"+p_F1_close+"')");
                }
                if(indexs[16] ==1){
                   // F1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhNtNyT2QdkZaUSbdTSclgvPRE4KAMCY24FU4xQgeGba8bx3W6Gr_UuktkjHzyas6hqzTgO4YUclLaQIfISHhyZgYSC-v7B9pnRFKdWD8lP-0C16wMdKkS1NJl80v5eetz2VveS4dPFzXvV0mMSiMLcIGDTCqRNs1tgzPxJ_C78GpeLZ7UkG1VYNj3R/s1600/F1.open.jpg);");
                    F1.setStyle("-fx-background-image:url('"+p_F1_open+"')");
                }
                if(indexs[17] == 0) {
                    F1.setVisible(true);
                    F2_b1.setVisible(true);
                    F2_b2.setVisible(true);
                    F2_b3.setVisible(true);
                    F2_b4.setVisible(true);
                    F2_door.setVisible(true);
                    F2_b1.setRotate(45*F2code[3]);
                    F2_b2.setRotate(45*F2code[2]);
                    F2_b3.setRotate(45*F2code[1]);
                    F2_b4.setRotate(45*F2code[0]);
                    if(indexs[18] ==1){
                        F2_door.setStyle("-fx-background-color: transparent;");
                    }
                }
            }else if (room_index == 7) {
                //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZ7Asw0F_OdvD0kVvgHO9B5v-n7iVoz-ElJdfDUVdwEWqMb9T85XSEuYK_094ArFGIwiqib7qH0Fl9xKhS3N_1H0806b8ociZOAiGr5ecAHx7u1flUbP4JpSwtLNDH2ks8cfFWGM8fLx7uX2PKhTEAEtlTudw0Zg5wUIpYlLF42pnE7i-kpWR0Rmm6/s16000/Gr.jpg);");
                pane.setStyle("-fx-background-image:url('"+p_G+"')");
                G1_button.setVisible(true);
                G1_ring1.setVisible(true);
                G1_ring2.setVisible(true);
                G1_ring3.setVisible(true);
                G1_ring4.setVisible(true);
                G1_touch_area.setVisible(true);
                if(indexs[19] ==1){
                    G1_button.setStyle("-fx-background-color: transparent;");
                }
                G1_ring1.setRotate(45*G1code[0]);
                G1_ring2.setRotate(45*G1code[1]);
                G1_ring3.setRotate(45*G1code[2]);
                G1_ring4.setRotate(45*G1code[3]);
            }else if (room_index == 8) {
                pane.setStyle("-fx-background-image:url('" + p_H + "')");
                H1.setVisible(true);
                H2.setVisible(true);
                H2_open.setVisible(true);
                H3.setVisible(true);
                if(indexs[20] == 1) {
                    H2_open.setVisible(true);
                    H2.setStyle("-fx-background-color: transparent;");
                }
                if(indexs[20] == 0) {
                    H2_open.setVisible(false);
                }
            }
            b_return.setVisible(false);
            right.setVisible(true);
            left.setVisible(true);
            Aa2_close.setVisible(false);
                 b_Aa2_1.setVisible(false);
                b_Aa2_2.setVisible(false);
                b_Aa2_3.setVisible(false);
                b_Aa2_4.setVisible(false);
        Aa2_open.setVisible(false);
        Aa1_close.setVisible(false);
        Aa1_open.setVisible(false);
        Aa1_im1.setVisible(false);
        Aa1_im2.setVisible(false);
        Aa1_im3.setVisible(false);
        Aa1_im4.setVisible(false);
        Aa1_im5.setVisible(false);
        Aa1_im6.setVisible(false);
        Aa1_im7.setVisible(false);
        Aa1_im8.setVisible(false);
        Aa1_im9.setVisible(false);
        Aa1_im10.setVisible(false);
        Aa1_im11.setVisible(false);
        Aa1_im12.setVisible(false);
        Aa1_b1.setVisible(false);
        Aa1_b2.setVisible(false);
        Aa1_b3.setVisible(false);
        Aa1_b4.setVisible(false);
        Aa1_b5.setVisible(false);
        Aa1_b6.setVisible(false);
        Aa1_b7.setVisible(false);
        Aa1_b8.setVisible(false);
        Aa1_b9.setVisible(false);
        Aa1_b10.setVisible(false);
        Aa1_b11.setVisible(false);
        Aa1_b12.setVisible(false);
        Aa1_b13.setVisible(false);
        Aa1_b14.setVisible(false);
        Aa1_open_b.setVisible(false);
        Aa3_b1.setVisible(false);
        Aa3_b2.setVisible(false);
        Aa3_b3.setVisible(false);
        Aa3_b4.setVisible(false);
        Aa3_b5.setVisible(false);
        Aa4_b.setVisible(false);
        Aa4_card.setVisible(false);
        Aa5_down.setVisible(false);
        Aa5_up.setVisible(false);
        Aa5_wheel.setVisible(false);
        Bb1a_open.setVisible(false);
        Bb1b_open.setVisible(false);
        Bb1a_close.setVisible(false);
        Bb1b_close.setVisible(false);
        Bb3_back.setVisible(false);
        Bb3_door_up.setVisible(false);
        Bb3_door_down.setVisible(false);
        Bb3_im1_down.setVisible(false);
        Bb3_im2_down.setVisible(false);
        Bb3_im3_down.setVisible(false);
        Bb3_im4_down.setVisible(false);
        Bb3_im1_up.setVisible(false);
        Bb3_im2_up.setVisible(false);
        Bb3_im3_up.setVisible(false);
        Bb3_im4_up.setVisible(false);
        Bb3_b1.setVisible(false);
        Bb3_b2.setVisible(false);
        Bb3_b3.setVisible(false);
        Bb3_b4.setVisible(false);
        Bb3_b5.setVisible(false);
        Bb3_b6.setVisible(false);
        Bb3_b7.setVisible(false);
        Bb3_b8.setVisible(false);
        Bb3_im_code1.setVisible(false);
        Bb3_im_code2.setVisible(false);
        Bb3_im_code3.setVisible(false);
        Cc1_b1.setVisible(false);
        Cc1_b2.setVisible(false);
        Cc1_b3.setVisible(false);
        Cc1_b4.setVisible(false);
        Cc1_b5.setVisible(false);
        Cc1_b6.setVisible(false);
        Cc1_b7.setVisible(false);
        Cc1_b8.setVisible(false);
        Cc1_b9.setVisible(false);
        Cc1_door.setVisible(false);
        Cc3_b1.setVisible(false);
        Cc3_b2.setVisible(false);
        Cc3_b3.setVisible(false);
        Cc3_b4.setVisible(false);
        Cc3_b5.setVisible(false);
        Cc3_b6.setVisible(false);
        Cc3_b7.setVisible(false);
        Cc3_b8.setVisible(false);
        Cc3_b9.setVisible(false);
        Cc3_text.setVisible(false);
        Cc2_b.setVisible(false);
        Cc4_b.setVisible(false);
        Dd1.setVisible(false);
        Dd1d1_b1.setVisible(false);
        Dd1d1_b2.setVisible(false);
        Dd1d1_b3.setVisible(false);
        Dd1d1_b4.setVisible(false);
        Ee3_open.setVisible(false);
        Ee3_close.setVisible(false);
        Ee3_b1.setVisible(false);
        Ee3_b2.setVisible(false);
        Ee3_b3.setVisible(false);
        Ee3_b4.setVisible(false);
        //Ee3_b1.setVisible(false);
        Ee2_b1.setVisible(false);
        Ee2_b2.setVisible(false);
        Ee2_b3.setVisible(false);
        Ee1_b1.setVisible(false);
        Ee1_b2.setVisible(false);
        Ee1_b3.setVisible(false);
        Ee1_b4.setVisible(false);
        Ee1_b5.setVisible(false);
        Ee1_door.setVisible(false);
        Ee1_reset.setVisible(false);
        Ff1.setVisible(false);
        Ff1f1_b1.setVisible(false);
        Ff1f1_b2.setVisible(false);
        Ff2_b1.setVisible(false);
        Ff2_b2.setVisible(false);
        Ff2_b3.setVisible(false);
        Ff2_b4.setVisible(false);
        Ff2_door.setVisible(false);
        Gg1_door.setVisible(false);
        Gg1_b1.setVisible(false);
        Gg1_b2.setVisible(false);
        Gg1_b3.setVisible(false);
        Gg1_b4.setVisible(false);
        Gg1_b_1.setVisible(false);
        Gg1_b_2.setVisible(false);
        Gg1_b_3.setVisible(false);
        Gg1_b_4.setVisible(false);
        Hh2_open.setVisible(false);
        Hh2_close.setVisible(false);
        Hh2_1_color.setVisible(false);
        Hh2_2_color.setVisible(false);
        Hh2_3_color.setVisible(false);
        Hh2_4_color.setVisible(false);
        Hh2_b1a.setVisible(false);
        Hh2_b1b.setVisible(false);
        Hh2_b2a.setVisible(false);
        Hh2_b2b.setVisible(false);
        Hh2_b3a.setVisible(false);
        Hh2_b3b.setVisible(false);
        Hh2_b4a.setVisible(false);
        Hh2_b4b.setVisible(false);
        Hh1_b.setVisible(false);
        Hh3_b.setVisible(false);
        Thing1_a.setVisible(false);
        H2_clue_1.setVisible(false);
        H2_clue_2.setVisible(false);
        H2_clue_3.setVisible(false);
        H2_clue_4.setVisible(false);
        if(indexs[9] == 1) {
            Dd1.setVisible(true);
            indexs[9] = 0;
            left.setVisible(false);
            right.setVisible(false);
            b_return.setVisible(true);
        }
        if(indexs[17] == 1){
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjr76T-Bf77DPiSgqHcebLHKUDofwLwYTXPtoElUEMpJvjEfqv7PPugKtkGv3LpQFZEcF-vJplTU9_4LmqYlhdTSWcgo32m1gyQ3h6VBo8TwjDQdfWhBt72ql0AVTBhQ4kCAPsC3hegvaII4rhJT7EDVweA-IwDRnYb60T7HUcQ83SwJDgdfik3-3HK/s16000/F-1r.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_F1+"')");
            Ff1.setVisible(true);
            left.setVisible(false);
            right.setVisible(false);
            b_return.setVisible(true);
            //Ff1f1_b1.setVisible(tr);
            indexs[17] = 0;
        }
        if(indexs[22] == 1){
            pane.setStyle("-fx-background-image:url('"+p_H3+"')");
            Hh3_b.setVisible(true);
            H3.setVisible(false);
            H2.setVisible(false);
            H2_open.setVisible(false);
            H1.setVisible(false);
            left.setVisible(false);
            right.setVisible(false);
            b_return.setVisible(true);
            indexs[22] = 0;
        }
    }

    public void leftButton(ActionEvent event) throws IOException {
        if(room_index == 1){
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgg3XI01e_ZJNJ2jCMv_vcRhHFS_FVVghZtKyOQMWLdXrTo7xN6d-XmNYoSSwDVnyXqR6hS6HnbN7LWURcl1-AvYnVSt0YLfIMIo-TQoUSzcRYxqalhuPbdFYI-zlO7msGFVJye78UxpDY27OTQ00hW_Yl4Lx5ZoGOezP0Td2KupAlxE6J-rHeglkRU4g/s16000/ata1.jpg);");
           // pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjYB4OlvnksJH2653qEriZseztLvBPNlpow9953rxEhPcplBsc4T1Blgkry5emw7XauT7AwdVfxKkLOEFAO5gyzPI3QYUddnrSYBl0d_3J5gncq_9Jlz4hvmwiDt0bh1UwSJQniOr5Clxjr-m_eVDfHuM_C6-aY9L4r7p8O0YIG1xcRJpnj6rg2F-PH/s16000/D.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZNn9goV3k2uOhBsSbjow8HLzgco7PT05fsNV9VgSLKLVFa5bgCEQF0161axPbAE8TbFP3saisdD2JKwp1q7xZ5D4zu9H0dqsK-uuUQw1gvP7QmOeQ6B1d2L9n4fGxI91GnYHI-YyFeZGMJsUyXmJ7W63bij_IIPU15QtJzcc8DXP3j29CJKxg_izs/s16000/Dr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_D+"')");
            room_index = 4;
            door.setVisible(false);
            idoor1.setVisible(false);
            Thing1_A.setVisible(false);
            A2_close.setVisible(false);
            A2_open.setVisible(false);
            A1_open.setVisible(false);
            A3.setVisible(false);
            A4.setVisible(false);
            A5.setVisible(false);
            A1.setVisible(false);
            D1.setVisible(true);
            if(indexs[8] == 0) {
                //D1.setVisible(true);
                //D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhPLHSd57nFuYSEslqTKdOVKl3Y3if38SflU12fq_1MY60OOVqeOglW6EJyC75Z01MtC3vfBZkuy07yE9OkH5OicpspbUu9T6A7Qe_Z1snS5qyP27xXAmr4sjhtAKulzThHkSnfRtzJJT59V5RCuNcOw50Q426eV197Xuc7RdgKf6eLc858349ov3q9/s16000/D1.close.jpg);");
                D1.setStyle("-fx-background-image:url('"+im_D1_close+"')");
            }
            if(indexs[8] == 1) {
                //D1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjW-ZSyNc-pLGJ11zUc4YKjhuU6ULOUuKmx67DlBycIMUZAk4Cz4QsfE17prX8oeL3_-mN1-QVy4HQOyrhwlqLTkrJvI4P2j-zQQ8ivil8u7Rrrrnpu7aJXHKtBP_ew-WcLXyHskKHVfyHQ1OmP6iLe1lbRPNNudjfEnYBX8Vorl-9ZAA4NyKm2sqK3/s1600/D1.open.jpg);");
                D1.setStyle("-fx-background-image:url('"+im_D1_open+"')");
            }
            Text.setText("D");
        } else if (room_index == 2) {
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiLigvc_Qa2JJzDoqtOr2auuXrPZy7CW0bjbbw2wjdqHgz3df-Du3SqToRbfeOGHKdoZZ0SFT6hbgdDNpc-aIHn_K1lXKBQ3LC9KpRRcjz_ETsjoO_idBY20KFa0zFtBe8iUvAXk3POlGnLgIdZB0TdTs_XqMt9yTKACw8Rb1M2uY_XpjHK6WNXlTamuw/s16000/ata.jpg);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiaoUleIr_flTUQiihgbFaf0WjBvgcpp60xH8ZX2OTVCbvDCvkTLRoODdAEIJ9qys-RMgu9NNrhYwd218t4P-Sy6TEDDT3dlYPc34zlWSNOy6snulsGThnr9f8qSbat_wzbEdkGMD6sE56VHeThoVvivE8BVBHkKzXGdsXSAriUsecUk5tmsJkWOCOi/s16000/A.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg1fiYNSLo6kbFfcW4oayKGYo_h5_6FlqiRTTWQoMztm_J7ZyJTv1TglUB05DXuTj9TzX6ER67GP0Wa2-dsFHOKP3rW59OTOy1JRLACZIUePtXKwYDMUaY0iz6BJXLzCLyZUNUcCf8cf3ommScy68Kw8SnYAjr7NLYZQxnR3alhHPjUXObujeLpqsHA/s16000/Ar.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_A+"')");
            room_index--;
            Text.setText("A");
            door.setVisible(true);
            A3.setVisible(true);
            A4.setVisible(true);
            A5.setVisible(true);
            door_key2.setVisible(false);
            B1a_close.setVisible(false);
            B1b_close.setVisible(false);
            B1b_open.setVisible(false);
            B1a_open.setVisible(false);
            B2.setVisible(false);
            B3.setVisible(false);
            B3_im_code1.setVisible(false);
            B3_im_code2.setVisible(false);
            B3_im_code3.setVisible(false);
            Number_code_room_B.setVisible(false);
            if(door1_index == 0) {
                idoor1.setVisible(true);
            }
            if(indexs[1] == 1) {
                A2_open.setVisible(true);
                A2_close.setVisible(true);
                A2_close.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[1] == 0) {
                A2_close.setVisible(true);
            }
            if(indexs[3] == 1) {
                A1_open.setVisible(true);
                A1.setVisible(true);
                A1.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[3] == 0 || indexs[3] == 2 ) {
                A1.setVisible(true);
            }
            if(things[1]==0){
                Thing1_A.setVisible(true);
            }
        } else if (room_index == 3) {
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgg3XI01e_ZJNJ2jCMv_vcRhHFS_FVVghZtKyOQMWLdXrTo7xN6d-XmNYoSSwDVnyXqR6hS6HnbN7LWURcl1-AvYnVSt0YLfIMIo-TQoUSzcRYxqalhuPbdFYI-zlO7msGFVJye78UxpDY27OTQ00hW_Yl4Lx5ZoGOezP0Td2KupAlxE6J-rHeglkRU4g/s16000/ata1.jpg);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg2M9GGSasYwTSFgnehGqHhfqc3Au5dH2UFmXkGr0UhOwnUDZNJKqdHextmqtI5twQkBnrd5K4Ct2EgcGtfR3QXVRXaRZGpX2o9HyvB-kxeJk8yy7YGIsw3QviGKdQ5EB0RTdVVD1R7CDTlQNRgCdm1PyXajO11hF-gTKolwCCajpm0BblRqEWVNyEc/s16000/B.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiV1alZO4WqP6m7gawhxRELZrVvEPM3wjbLSeeoX08D69s4wstv2cdxNNaCUD2LJLVflea_OU_pBQjBB0Z_CV5ovnPkHwswcs1x8thxDGlRKg4umU-34mCcq_ZsPCIGvWb_v9uoiabzin-meFVScqGq4eFhsCv-1554ntoE-T6olrMhBxEVG9Y6J2xs/s16000/Br.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_B+"')");
            room_index--;
            Text.setText("B");
            door_key1.setVisible(false);
            if(door_key2_index == 0) {
                door_key2.setVisible(true);
            }
            if(indexs[4] == 0) {
                B1a_close.setVisible(true);
            }
            if(indexs[5] == 0) {
                B1b_close.setVisible(true);
            }
            if(indexs[4] == 1) {
                B1a_close.setVisible(true);
                B1a_open.setVisible(true);
                B1a_close.setStyle("-fx-background-color: transparent;");;
            }
            if(indexs[5] == 1) {
                B1b_close.setVisible(true);
                B1b_open.setVisible(true);
                B1b_close.setStyle("-fx-background-color: transparent;");;
            }
            if(indexs[6] == 0) {
                B3.setVisible(true);
            }
            if(indexs[6] == 1) {
                B3.setVisible(true);
                B3.setStyle("-fx-background-color: transparent;");;
            }
            Number_code_room_B.setVisible(true);
            B2.setVisible(true);
            C1_b1.setVisible(false);
            C1_b2.setVisible(false);
            C1_b3.setVisible(false);
            C1_b4.setVisible(false);
            C1_b5.setVisible(false);
            C1_b6.setVisible(false);
            C1_b7.setVisible(false);
            C1_b8.setVisible(false);
            C1_b9.setVisible(false);
            C1_door.setVisible(false);
            C3.setVisible(false);
            C2.setVisible(false);
            C4.setVisible(false);
            C_door.setVisible(false);
            C_door_open.setVisible(false);
            B3_im_code1.setVisible(true);
            B3_im_code2.setVisible(true);
            B3_im_code3.setVisible(true);
        } else if (room_index == 4) {
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgg3XI01e_ZJNJ2jCMv_vcRhHFS_FVVghZtKyOQMWLdXrTo7xN6d-XmNYoSSwDVnyXqR6hS6HnbN7LWURcl1-AvYnVSt0YLfIMIo-TQoUSzcRYxqalhuPbdFYI-zlO7msGFVJye78UxpDY27OTQ00hW_Yl4Lx5ZoGOezP0Td2KupAlxE6J-rHeglkRU4g/s16000/ata1.jpg);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjY1Gb6zVn3c7JsLaIHx9VHbccKoGa7HoL2iv-omqOogaKF9N93E8oaDbAUVdmAYhH9DJc0ynBGTphDFZ0A2qAh7eqMC4tkhViuKJL9t_r9_sjpr7yXMBZIL4MX9FFpckRdz4Gljm8vnIkd3WUhX2x4IIF_14hr4rHWVirBN7VZZjzTLcqIUgT8bju-/s16000/C.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjT1CBOiHGi-zPEYzOpecgLHzvzQxAeswWSsrFxcmebl7Kh8vxdBnZt-n7Wwc_vh0Rh02RobghyqwQdz2MtKnVpHjyD4_oNes48fIEqb4_84SL01aKvSnPUSL86uYSxQlA1VGjAgHC0q24l2_5kCSddqBMOOdwzDoHU8s0mnrG29dqKQd1bhSRKQJo7/s16000/Cr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_C+"')");
            room_index--;
            Text.setText("C");
            C1_b1.setVisible(true);
            C1_b2.setVisible(true);
            C1_b3.setVisible(true);
            C1_b4.setVisible(true);
            C1_b5.setVisible(true);
            C1_b6.setVisible(true);
            C1_b7.setVisible(true);
            C1_b8.setVisible(true);
            C1_b9.setVisible(true);
            C3.setVisible(true);
            C2.setVisible(true);
            C4.setVisible(true);
            if(indexs[10] == 0) {
                C_door.setVisible(true);
            }
            if(indexs[10] == 1) {
                C_door_open.setVisible(true);
                C_door.setVisible(true);
                C_door.setStyle("-fx-background-color: transparent;");
            }
            /*C1_b1.setStyle(Cc1_b1.getStyle());
            C1_b2.setStyle(Cc1_b2.getStyle());
            C1_b3.setStyle(Cc1_b3.getStyle());
            C1_b4.setStyle(Cc1_b4.getStyle());
            C1_b5.setStyle(Cc1_b5.getStyle());
            C1_b6.setStyle(Cc1_b6.getStyle());
            C1_b7.setStyle(Cc1_b7.getStyle());
            C1_b8.setStyle(Cc1_b8.getStyle());
            C1_b9.setStyle(Cc1_b9.getStyle());*/
            D1.setVisible(false);
            if(indexs[7] == 0) {
                C1_door.setVisible(true);
            }
            if(door_key1_index == 0) {
                door_key1.setVisible(true);
            }


        }else if (room_index == 5) {
            Text.setText("H");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh8zb_v-xS3zGhxf0foDXwJxxrISFO3EPjtkeumIQFr1hphTS4ndoobDZfQ8x9yHqHue4HYeC4nb_Ix9HHgffo-sctjGHPjT8gAu3ROe9c8bTV_V6qF6Oj2ekruKJvyIjp9HRBX7o2_usiS0pm5Qtk12Do5PSWQrA66RM56gAkYNzLayUzfPPTZfx71/s16000/H.png);");
            pane.setStyle("-fx-background-image:url('" + p_H + "')");
            room_index = 8;
            E_door.setVisible(false);
            E3_open.setVisible(false);
            E3.setVisible(false);
            E2_b1.setVisible(false);
            E2_b2.setVisible(false);
            E2_b3.setVisible(false);
            E1.setVisible(false);
            H1.setVisible(true);
            H2.setVisible(true);
            H2_open.setVisible(true);
            H3.setVisible(true);
            if(indexs[20] == 1) {
                H2_open.setVisible(true);
                H2.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[20] == 0) {
                H2_open.setVisible(false);
            }
        }else if (room_index == 6) {
            Text.setText("E");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjjOkvo_NfEdH7cmM9jdwKx4KbpxlJwdIr7UBSMfsWmtw6TmrPFCFK9JMbOhgub_WbBwjCrnnadhftJJn4A-M69LUoe67nigce56xn0f1LpjkOzALTEiJhU8MtvnF403z3AZskIBVSTk0IL05ljFyhdkE2jmr3ZbkqZHdQGtGr2jOSAgAWFKUHUUkVM/s16000/E.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi4QxtymjIL87C98SFcKso-D179iBrwInfzJBpeHn2VvKD116_cpmkwZh8SsnIRlgyukr4YLdITDUuEG-ebAsJVlbHVAxsDD1j6izxvga7tLwcZMaM4aSv9tIaa2YkwUvj79wrmGGwb07hlswYJlLmxpX-bvhg4hJMEy4v1Ypf1Be__Lxjy_gONeg9x/s16000/Er.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_E+"')");
            E_door.setVisible(true);
            E2_b1.setVisible(true);
            E2_b2.setVisible(true);
            E2_b3.setVisible(true);
            E1.setVisible(true);
            F1.setVisible(false);
            F2_b1.setVisible(false);
            F2_b2.setVisible(false);
            F2_b3.setVisible(false);
            F2_b4.setVisible(false);
            F2_door.setVisible(false);
            room_index--;
            if(indexs[12] == 0) {
                //E2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                E2_b1.setStyle("-fx-background-image:url('"+im_E2_close+"')");
            }
            if(indexs[12] == 1) {
                //E2_b1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                E2_b1.setStyle("-fx-background-image:url('"+im_E2_open+"')");
            }
            if(indexs[13] == 0) {
                //E2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                E2_b2.setStyle("-fx-background-image:url('"+im_E2_close+"')");
            }
            if(indexs[13] == 1) {
                //E2_b2.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                E2_b2.setStyle("-fx-background-image:url('"+im_E2_open+"')");
            }
            if(indexs[14] == 0) {
                //E2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjVZ4ebd3EOCM8tzgvAvNgUlYgkiDIN4h0nnMgcXi9-xCodCSb2fQAAthiU7z5UJk14L8VG42m-QgsbhXpgfQ9-NTcHE2mLeskwnaxnwejbvAyf3snBMI8M8xVeNMKleDSyRgn7z3z9OEtgcMnQ7z2sn7VzzQ5jFSaqKFHm1mXmKSZEyipmW1FyDeHn/s1600/E2.close.jpg);");
                E2_b3.setStyle("-fx-background-image:url('"+im_E2_close+"')");
            }
            if(indexs[14] == 1) {
                //E2_b3.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhfmOr4zl5WDal2G8Jeu9d2UFohzRb1rnzc6eCaVMQB2ebGUUF7KTSA7VdTNyeaf62PLhQljc94XoG8L9v1zACKUvABR2i8ytFdna3hxPIvyXcApi5vBPV02iAYa-96LQtYfN-2c-MaqbGgXurRE9594bhY8_9PX0WxPTsGNwtoxkA6lGuVlqancHJu/s1600/E2.open.jpg);");
                E2_b3.setStyle("-fx-background-image:url('"+im_E2_open+"')");
            }
            if(indexs[11] == 1) {
                E3_open.setVisible(true);
                E3.setVisible(true);
                E3.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[11] == 0) {
                E3.setVisible(true);
            }
            if(indexs[15] == 0) {
                //E1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiwVIk40oPwraBqKbzPSOUFi33kxxBC9N1jUfdflwNUFNKK6lZtTFnvAJfk3nTj4p05L_r8L14RFrQglCVehr280R3SsbzUlOZfnTCUjizz4BL1yictvQZNFd489Le3Q5cAB7xf4F_WXtcgTT87hEMfsgIaypYkNZIb2A40yksw2QD8ZJ8XcMdaQ5dZ/s16000/E1.close.jpg);");
                //E1.setStyle("-fx-background-image:url('"+im_E1+"')");
                E1.setStyle("-fx-background-image:url('"+im_E1_close+"')");
            }
            if(indexs[15] == 1) {
                //E1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgMjz07RnKkBl-EAfJq-E4HVwvipr5m17mfeQm1L0TNmKKcxK0a0Z0yIba1VoNZshBQWEHpKgX8P6a6PxfKTAxGGvyjjUzhtsTXgdYgBrswGAcxMPKHE-bFF5gnlcTl1X3M78B2DnKMuwANyNp16ImZDPS8Y_fD4yPd72oO6-TXPZn1m6rs4c9CitWh/s1600/E1.open.jpg);");
                E1.setStyle("-fx-background-image:url('"+im_E1_open+"')");
            }
        }else if (room_index == 7) {
            Text.setText("F");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgAML7weYa6TuQMC13YlUTdebq75owy5NmeoKTamiEUaSYW349JqXwfSAZC2Q2_ZBmFasHmuyQe57NZZIH_2wRpUwJoWvB57jBYKD5B-oEUMxO32buFAx3HIhzB7Wl5jnQzgYwgZP9yHP7dLGRlCxb8dOQFoOWqyCp0c9iiM12G9BX8K-qjuzCQLM6h/s16000/F.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEicrBqU2i5CUgUCsuW7YltDlmrx35fdxtUMB1BEkvHbHQC6Is36NlI6Zw0mgAIJ_BZnaYiScwzA9qxZuJYGmFZGltmhtmdxbJXOvpXMApVu593PSAjSH0udttLzz2C4iYfTdnCBHFSHjQ_LjP3ssdIfDlOBiu2LyLgdJfNG_kvda6x3Syhp1j5ncWur/s16000/Fr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_F+"')");
            F1.setVisible(true);
            F2_b1.setVisible(true);
            F2_b2.setVisible(true);
            F2_b3.setVisible(true);
            F2_b4.setVisible(true);
            F2_door.setVisible(true);
            G1_button.setVisible(false);
            G1_ring1.setVisible(false);
            G1_ring2.setVisible(false);
            G1_ring3.setVisible(false);
            G1_ring4.setVisible(false);
            G1_touch_area.setVisible(false);
            if(indexs[18] ==1){
                F2_door.setStyle("-fx-background-color: transparent;");
            }
            if(indexs[16] ==0){
               // F1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiarg4BWLmfWHamA4KNseitPyZ7d7xyMuynpjWa5URGEnTCGUwdqxL15ZoWWGCQePZlMWlW3mHSP8sZ4WCYDSQpC57Qw6oStlwrlDPj48exCwDeUfr7t7gTpBkOcHpC-glA-esyicuAyL_OL6t_8uB5uvWaXE3RpQUD3XvnJ8YsWNIFMHQRK5MIdsvu/s1600/F1.close.jpg);");
                F1.setStyle("-fx-background-image:url('"+p_F1_close+"')");
            }
            if(indexs[16] ==1){
                //F1.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhNtNyT2QdkZaUSbdTSclgvPRE4KAMCY24FU4xQgeGba8bx3W6Gr_UuktkjHzyas6hqzTgO4YUclLaQIfISHhyZgYSC-v7B9pnRFKdWD8lP-0C16wMdKkS1NJl80v5eetz2VveS4dPFzXvV0mMSiMLcIGDTCqRNs1tgzPxJ_C78GpeLZ7UkG1VYNj3R/s1600/F1.open.jpg);");
                F1.setStyle("-fx-background-image:url('"+p_F1_open+"')");
            }
            room_index--;
        }else if (room_index == 8) {
            Text.setText("G");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhHvaGDXISIi9GWjgBpZRrSrF0U649LLaO5s2d5FWAY9OpgD5q9KObPxn3aCahYMDLIuXOY1_Vn4K7LqVYKqmBCeNR6-dYpfsTAPYmfDXOAXB_T8kY9EZJoFWUyr530qNgnxMlSMwKatkSOkiieOQ4-n3yVFGd0EoiZQWj8sCqczNcQKYClZTOZRG-h/s16000/G.png);");
            //pane.setStyle("-fx-background-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZ7Asw0F_OdvD0kVvgHO9B5v-n7iVoz-ElJdfDUVdwEWqMb9T85XSEuYK_094ArFGIwiqib7qH0Fl9xKhS3N_1H0806b8ociZOAiGr5ecAHx7u1flUbP4JpSwtLNDH2ks8cfFWGM8fLx7uX2PKhTEAEtlTudw0Zg5wUIpYlLF42pnE7i-kpWR0Rmm6/s16000/Gr.jpg);");
            pane.setStyle("-fx-background-image:url('"+p_G+"')");
            room_index--;
            G1_button.setVisible(true);
            G1_ring1.setVisible(true);
            G1_ring2.setVisible(true);
            G1_ring3.setVisible(true);
            G1_ring4.setVisible(true);
            G1_touch_area.setVisible(true);
            H1.setVisible(false);
            H2.setVisible(false);
            H2_open.setVisible(false);
            H3.setVisible(false);
            if(indexs[19] ==1){
                G1_button.setStyle("-fx-background-color: transparent;");
            }
        }
    }
    /*url(&quot;https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png&quot;);"*/


    public void door_key1_control(ActionEvent event) throws IOException {
        if(door_key1_index == 0){
            mediaPlayer.play();
            help_int = 1;
            inventory_space_check();
            //image1.setLayoutY(815);
            //image1.setVisible(true);
            //image1.setDisable(true);
            if(empty_space == 0) {
                image1.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                //inventory1.setText("Key1");
                image1.setVisible(true);
                //image1.setLayoutX(110);
            } else if (empty_space == 1) {
                image2.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                //inventory2.setText("Key1");
                image2.setVisible(true);
                //image1.setLayoutX(212);
            } else if (empty_space == 2) {
                image3.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image3.setVisible(true);
            } else if (empty_space == 3) {
                image4.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image4.setVisible(true);
            } else if (empty_space == 4) {
                image5.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image5.setVisible(true);
            } else if (empty_space == 5) {
                image6.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image6.setVisible(true);
            } else if (empty_space == 6) {
                image7.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image7.setVisible(true);
            } else if (empty_space == 7) {
                image8.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image8.setVisible(true);
            } else if (empty_space == 8) {
                image9.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image9.setVisible(true);
            } else if (empty_space == 9) {
                image10.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image10.setVisible(true);
            } else if (empty_space == 10) {
                image11.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image11.setVisible(true);
            } else if (empty_space == 11) {
                image12.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image12.setVisible(true);
            } else if (empty_space == 12) {
                image13.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                image13.setVisible(true);
            }
            empty_space = 0;
            help_int = 0;
            door_key1.setVisible(false);
            door_key1_index++;
            //data_load();
        }
    }































    public static void Aa1Operation() throws IOException {
        Aa1_mismatch= 0;
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 4; j++ ){
               if(Aa1code[i][j] != Aa1answer[i][j]){
                   Aa1_mismatch = 1;
                   //System.out.println(Aa1code[i][j] + " = " + Aa1answer[i][j]);
               }
            }
        }
        if(Aa1_mismatch == 0){
            indexs[3] = 2;
            //System.out.println("USPECH");
        }
    }
    public static void Aa1answer_generate() throws IOException {
        int Numbers[] = {1, 2, 3};
        int Subjects[] = new int[3];
        int Subjects1[] = new int[3];
        int help[] = new int[10];
        Random generator = new Random();
        int coda = 0;
        int coda2 = -1;
        for (int o = 0; o < 3; o++) {
            int randomNumber2 = generator.nextInt(Numbers.length);
            coda2++;
            Subjects[coda2] = Numbers[randomNumber2];
            Subjects1[coda2] = Subjects[coda2];
            Numbers[randomNumber2] = Numbers[randomNumber2] * -1;
            for (int y = 0; y < Numbers.length; y++) {
                help[y] = Numbers[y];
            }
            Numbers = new int[Numbers.length - 1];
            for (int y = 0; y < Numbers.length; y++) {
                if (help[y] >= 0) {
                    Numbers[y] = help[y + coda];
                } else {
                    coda++;
                    Numbers[y] = help[y + coda];

                }
            }
            coda = 0;

        }


        coda = 0;

        System.out.println("");
        System.out.print("A1 answer:");
        System.out.println("");
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 4; j++ ){
                Aa1answer[i][j] = Subjects[i];
                System.out.print(Aa1answer[i][j]);
            }
            System.out.println("");
        }
    }

    public static void Aa1code_generate() throws IOException {
        int Numbers[] = {1, 1, 1 ,1 ,2 ,2 ,2 ,2 ,3 ,3 ,3 ,3 };
        int Subjects[] = new int[12];
        int Subjects1[] = new int[12];
        int help[] = new int[20];
        Random generator = new Random();
        int coda = 0;
        int coda2 = -1;
        for (int o = 0; o < 12; o++) {
            int randomNumber2 = generator.nextInt(Numbers.length);
            coda2++;
            Subjects[coda2] = Numbers[randomNumber2];
            Subjects1[coda2] = Subjects[coda2];
            Numbers[randomNumber2] = Numbers[randomNumber2] * -1;
            for (int y = 0; y < Numbers.length; y++) {
                help[y] = Numbers[y];
            }
            Numbers = new int[Numbers.length - 1];
            for (int y = 0; y < Numbers.length; y++) {
                if (help[y] >= 0) {
                    Numbers[y] = help[y + coda];
                } else {
                    coda++;
                    Numbers[y] = help[y + coda];

                }
            }
            coda = 0;

        }


        coda = 0;

        System.out.println("");
        int sw = 0;
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 4; j++ ){
                Aa1code[i][j] = Subjects[sw];
                sw++;
            }
            System.out.println("");
        }
    }

    public static void Bb3answer_generate() throws IOException {
        int Numbers[] = {1, 2, 3 ,4 ,5 ,6 ,7,8  };
        int Subjects[] = new int[8];
        int Subjects1[] = new int[8];
        int help[] = new int[17];
        Random generator = new Random();
        int coda = 0;
        int coda2 = -1;
        for (int o = 0; o < 8; o++) {
            int randomNumber2 = generator.nextInt(Numbers.length);
            coda2++;
            Subjects[coda2] = Numbers[randomNumber2];
            Subjects1[coda2] = Subjects[coda2];
            Numbers[randomNumber2] = Numbers[randomNumber2] * -1;
            for (int y = 0; y < Numbers.length; y++) {
                help[y] = Numbers[y];
            }
            Numbers = new int[Numbers.length - 1];
            for (int y = 0; y < Numbers.length; y++) {
                if (help[y] >= 0) {
                    Numbers[y] = help[y + coda];
                } else {
                    coda++;
                    Numbers[y] = help[y + coda];

                }
            }
            coda = 0;

        }
        coda = 0;
        System.out.print("B3 - Answer:");
        System.out.println("");
        int sw = 0;

            for(int j = 0; j < 8; j++ ){
                Bb3_answer[j] = Subjects[sw]-1;
                //sw++;
                System.out.print(Bb3_answer[j] + "-");
                sw++;
            }
            System.out.println("");

    }
    public static void Cc1Operation() throws IOException {
        Cc1_mismatch = 0;
        for(int i = 0; i < 3; i++ ){
            for(int j = 0; j < 3; j++ ){
                if(Cc1code[i][j] != Cc1answer[i][j]){
                    Cc1_mismatch = 1;
                }
            }
        }
        if(Cc1_mismatch == 0){
            System.out.println("USPECH");
        }
    }
    public static void Cc1code_generator() throws IOException {
        /*int Numbers[] = { 1,2, 3, 4, 5, 6, 7, 8};
        int Subjects[] = new int[8];
        int Subjects1[] = new int[8];
        int help[] = new int[17];
        Random generator = new Random();
        int coda = 0;
        int coda2 = -1;
        for (int o = 0; o < 8; o++) {
            int randomNumber2 = generator.nextInt(Numbers.length);
            coda2++;
            Subjects[coda2] = Numbers[randomNumber2];
            Subjects1[coda2] = Subjects[coda2];
            Numbers[randomNumber2] = Numbers[randomNumber2] * -1;
            for (int y = 0; y < Numbers.length; y++) {
                help[y] = Numbers[y];
            }
            Numbers = new int[Numbers.length - 1];
            for (int y = 0; y < Numbers.length; y++) {
                if (help[y] >= 0) {
                    Numbers[y] = help[y + coda];
                } else {
                    coda++;
                    Numbers[y] = help[y + coda];

                }
            }
            coda = 0;

        }
        coda = 0;
        System.out.print("C - Answer:");
        System.out.println("");
        int sw = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //Cc1code[i][j] = Subjects[sw] - 1;
                //sw++;
                if(sw != 8) {
                    Cc1code[i][j] = Subjects[sw] - 1;
                    System.out.print(Cc1code[i][j] + "-");
                }else{
                    Cc1code[i][j] = 8;
                    System.out.print(Cc1code[i][j] + "-");
                }
                sw++;
            }
            System.out.println("");
        }*/
        Cc1code[0][0] = 0;
        Cc1code[1][0] = 3;
        Cc1code[2][0] = 4;
        Cc1code[0][1] = 1;
        Cc1code[1][1] = 8;
        Cc1code[2][1] = 7;
        Cc1code[0][2] = 6;
        Cc1code[1][2] = 2;
        Cc1code[2][2] = 5;
    }
    public static void Cc3Operation() throws IOException {
        Cc3_mismatch = 0;
        if(Cc3_code > 9999){
            /*Cc3_code = Cc3_code + help_int * Cc3_rounds;
            Cc3_rounds = Cc3_rounds*10;*/
            int h = help_int;
            int o = Cc3_code *10;
            Cc3_code = o + h;
            if(Cc3_code == Cc3_answer ){
                Cc3_mismatch = 1;
            }else{
                help_int = Cc3_code;
                Cc3_rounds = 1;
                Cc3_code = 0;
            }
        }else {
            /*Cc3_code = Cc3_code + help_int * Cc3_rounds;
            Cc3_rounds = Cc3_rounds*10;*/
            int h = help_int;
            int o = Cc3_code *10;
            Cc3_code = o + h;
        }

    }

    public static void Cc3answer_generator() throws IOException {
        int counter = 0;
        for(int i = 0; i < 6; i++){
            Random rand1 = new Random();
            int int_random1 = rand1.nextInt(7);
            Random rand2 = new Random();
            int int_random2 = rand2.nextInt(7);
            if(Number_phone_C3[int_random1][int_random2] == 0){
                i--;
            }else{
                int h = Number_phone_C3[int_random1][int_random2];
                int o = Cc3_answer *10;
                Cc3_answer = o + h;
                if(counter == 0){
                    C3_answer_help[0][0] = int_random1;
                    C3_answer_help[1][0] = int_random2;
                }else if(counter == 1){
                    C3_answer_help[0][1] = int_random1;
                    C3_answer_help[1][1] = int_random2;
                }else if(counter == 2){
                    C3_answer_help[0][2] = int_random1;
                    C3_answer_help[1][2] = int_random2;
                }else if(counter == 3){
                    C3_answer_help[0][3] = int_random1;
                    C3_answer_help[1][3] = int_random2;
                }else if(counter == 4){
                    C3_answer_help[0][4] = int_random1;
                    C3_answer_help[1][4] = int_random2;
                }else if(counter == 5){
                    C3_answer_help[0][5] = int_random1;
                    C3_answer_help[1][5] = int_random2;
                }
                counter++;
                Number_phone_C3[int_random1][int_random2] = 0;
            }

        }
        System.out.println("C3 - Answer");
        System.out.println(Cc3_answer);
        /*System.out.println("daaaaaaaaaaaaa");
        //System.out.println(Number_phone_C3[0][0]);
        System.out.println(Cc3_answer);
        System.out.println("daaaaaaaaaaaaa");*/

    }
    public static void Cc3music_play() throws IOException {
        for(int i = 0; i < 5; i++) {
            if (E1answer[i] == 1) {
                A_note_play();
            } else if (E1answer[i] == 2) {
                B_note_play();
            } else if (E1answer[i] == 3) {
                C_note_play();
            } else if (E1answer[i] == 4) {
                D_note_play();
            } else if (E1answer[i] == 5) {
                E_note_play();
            }
            long t = System.currentTimeMillis();
            long end = (long) (t + 1001);

            while (System.currentTimeMillis() < end) {

            }
        }

    }

     ///style="-fx-background-image: url(&quot;https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiV1alZO4WqP6m7gawhxRELZrVvEPM3wjbLSeeoX08D69s4wstv2cdxNNaCUD2LJLVflea_OU_pBQjBB0Z_CV5ovnPkHwswcs1x8thxDGlRKg4umU-34mCcq_ZsPCIGvWb_v9uoiabzin-meFVScqGq4eFhsCv-1554ntoE-T6olrMhBxEVG9Y6J2xs/s16000/Br.jpg&quot;);"
    public static void Ee1Operation() throws IOException {
        //help_int;
        Ee1_mismatch = 0;
        for(int i = 0; i < 4; i++){
            E1code[i] = E1code[i+1];
        }
        E1code[4] = help_int;
        for(int i = 0; i < 5; i++){
            if(E1code[i] != E1answer[i]){
                Ee1_mismatch = 1;
            }
        }
        if(Ee1_mismatch  == 0){
            System.out.print("Uspech");
        }
        /*System.out.println("Code" + Ee1_mismatch + " ");
        for(int i = 0; i < 5; i++){
            System.out.print(E1code[i] + ", ");
        }*/
        //System.out.println("Code" + Ee1_mismatch + " ");
    }
    public static void Ee1answer_generator() throws IOException {
        int counter = 0;
        for(int i = 0; i < 5; i++){
            Random rand3 = new Random();
            int int_random3 = rand3.nextInt(5);
            E1answer[i] = int_random3+1;
        }
        for(int i = 0; i < 5; i++){
            System.out.println("Codeds ");
            System.out.print(E1answer[i] + ", ");
        }
    }

    public static void Ff1Operation() throws IOException {
        Ff1_mismatch = 0;
        for(int i = 0; i < 2; i++) {
            if (F1code[i] != F1answer[i]) {
                Ff1_mismatch = 1;
            }
        }
            if(Ff1_mismatch  == 0){
                System.out.print("Uspech");
            }
    }

    public static void Ff2Operation() throws IOException {
        Ff2_mismatch = 0;
        for(int i = 0; i < 4; i++) {
            if (F2code[i] != F2answer[i]) {
                Ff2_mismatch = 1;
            }
        }
        if(Ff2_mismatch  == 0){
            System.out.print("Uspech");
        }
    }
    public static void Gg1Operation() throws IOException {
        Gg1_mismatch = 0;
        for(int i = 0; i < 4; i++) {
            if (G1code[i] != G1answer[i]) {
                Gg1_mismatch = 1;
            }
        }
        if(Gg1_mismatch  == 0){
            System.out.print("Uspech");
        }
    }
    public static void Ee3answer_generator() throws IOException {
        int counter = 0;
        for(int i = 0; i < 4; i++){
            Random rand4 = new Random();
            int int_random4 = rand4.nextInt(2);
            int bit = int_random4;
            if(counter == 0){
                if(int_random4 == 0){
                    //E3answer[0] =
                }else{

                }
            } else if (counter == 1) {

            } else if(counter == 2){

            }else if(counter == 3){

            }
            counter++;

        }
    }

    public void door_control(ActionEvent event) throws IOException {
        if(actual_thing == 1){
            help_int = actual_thing;
            looking_for_item();
            if(item_elimination == 0){
                //image1.setImage(null);
                image1.setStyle(null);
                //image1.setVisible(false);
                image1.setStyle(image2.getStyle());
                image2.setStyle(image3.getStyle());
                image3.setStyle(image4.getStyle());
                image4.setStyle(image5.getStyle());
                image5.setStyle(image6.getStyle());
                image6.setStyle(image7.getStyle());
                image7.setStyle(image8.getStyle());
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
                /*image1.setImage(image2.getImage());
                image2.setImage(image3.getImage());
                image3.setImage(image4.getImage());
                image4.setImage(image5.getImage());
                image5.setImage(image6.getImage());
                image6.setImage(image7.getImage());
                image7.setImage(image8.getImage());
                image8.setImage(image9.getImage());
                image9.setImage(image10.getImage());
                image10.setImage(image11.getImage());
                image11.setImage(image12.getImage());
                image12.setImage(image13.getImage());*/
            } else if (item_elimination == 1) {
                image2.setStyle(null);
                //image1.setStyle(image2.getStyle());
                image2.setStyle(image3.getStyle());
                image3.setStyle(image4.getStyle());
                image4.setStyle(image5.getStyle());
                image5.setStyle(image6.getStyle());
                image6.setStyle(image7.getStyle());
                image7.setStyle(image8.getStyle());
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 2) {
                image3.setStyle(null);
                image3.setStyle(image4.getStyle());
                image4.setStyle(image5.getStyle());
                image5.setStyle(image6.getStyle());
                image6.setStyle(image7.getStyle());
                image7.setStyle(image8.getStyle());
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 3) {
                image4.setStyle(null);
                image4.setStyle(image5.getStyle());
                image5.setStyle(image6.getStyle());
                image6.setStyle(image7.getStyle());
                image7.setStyle(image8.getStyle());
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 4) {
                image5.setStyle(null);
                image5.setStyle(image6.getStyle());
                image6.setStyle(image7.getStyle());
                image7.setStyle(image8.getStyle());
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 5) {
                image6.setStyle(null);
                image6.setStyle(image7.getStyle());
                image7.setStyle(image8.getStyle());
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 6) {
                image7.setStyle(null);
                image7.setStyle(image8.getStyle());
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 7) {
                image8.setStyle(null);
                image8.setStyle(image9.getStyle());
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 8) {
                image9.setStyle(null);
                image9.setStyle(image10.getStyle());
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 9) {
                image10.setStyle(null);
                image10.setStyle(image11.getStyle());
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 10) {
                image11.setStyle(null);
                image11.setStyle(image12.getStyle());
                image12.setStyle(image13.getStyle());
            } else if (item_elimination == 11) {
                image12.setStyle(null);
                image12.setStyle(image13.getStyle());
            }
            image13.setImage(null);
            door1_index++;
            idoor1.setVisible(false);
            item_elimination = 0;
            actual_thing = 0;
            System.out.println("Open");
            door.setText("Open");
        }
    }
    public static void looking_for_item() throws IOException {
        for(int i = 0; i< inventory.length;i++ ) {
            if(inventory[i] == help_int){
                item_elimination = i;
                //System.out.println(item_elimination+ "sas");
                if(i < 12) {
                    for (int x = i; x < inventory.length-1; x++) {
                        System.out.println(x+ "sas");
                        inventory[x] = inventory[x+1];
                    }
                }
                inventory[inventory.length-1] = 0;
                break;
            }

        }
    }

    public static void data_load(){
        try{
            //File myObj = new File("SaveFile123.txt");
            BufferedReader br = new BufferedReader(new FileReader("SaveFile123.txt"));
            door1_index = Integer.parseInt(br.readLine());
            door_key1_index = Integer.parseInt(br.readLine());
            door_key2_index = Integer.parseInt(br.readLine());
            inventory[0] = Integer.parseInt(br.readLine());
            inventory[1] = Integer.parseInt(br.readLine());
            inventory[2] = Integer.parseInt(br.readLine());
            indexs[1] = Integer.parseInt(br.readLine());
            indexs[2] = Integer.parseInt(br.readLine());
            Aa2buttons[0] = Integer.parseInt(br.readLine());
            Aa2buttons[1] = Integer.parseInt(br.readLine());
            Aa2buttons[2] = Integer.parseInt(br.readLine());
            Aa2buttons[3] = Integer.parseInt(br.readLine());
            Aa2code[0] = Integer.parseInt(br.readLine());
            Aa2code[1] = Integer.parseInt(br.readLine());
            Aa2code[2] = Integer.parseInt(br.readLine());
            Aa2code[3] = Integer.parseInt(br.readLine());
            indexs[3] = Integer.parseInt(br.readLine());
            Aa1code[0][0] = Integer.parseInt(br.readLine());
            Aa1code[0][1] = Integer.parseInt(br.readLine());
            Aa1code[0][2] = Integer.parseInt(br.readLine());
            Aa1code[0][3] = Integer.parseInt(br.readLine());
            Aa1code[1][0] = Integer.parseInt(br.readLine());
            Aa1code[1][1] = Integer.parseInt(br.readLine());
            Aa1code[1][2] = Integer.parseInt(br.readLine());
            Aa1code[1][3] = Integer.parseInt(br.readLine());
            Aa1code[2][0] = Integer.parseInt(br.readLine());
            Aa1code[2][1] = Integer.parseInt(br.readLine());
            Aa1code[2][2] = Integer.parseInt(br.readLine());
            Aa1code[2][3] = Integer.parseInt(br.readLine());
            Aa1answer[0][0] = Integer.parseInt(br.readLine());
            Aa1answer[0][1] = Integer.parseInt(br.readLine());
            Aa1answer[0][2] = Integer.parseInt(br.readLine());
            Aa1answer[0][3] = Integer.parseInt(br.readLine());
            Aa1answer[1][0] = Integer.parseInt(br.readLine());
            Aa1answer[1][1] = Integer.parseInt(br.readLine());
            Aa1answer[1][2] = Integer.parseInt(br.readLine());
            Aa1answer[1][3] = Integer.parseInt(br.readLine());
            Aa1answer[2][0] = Integer.parseInt(br.readLine());
            Aa1answer[2][1] = Integer.parseInt(br.readLine());
            Aa1answer[2][2] = Integer.parseInt(br.readLine());
            Aa1answer[2][3] = Integer.parseInt(br.readLine());
            indexs[4]= Integer.parseInt(br.readLine());
            indexs[5]= Integer.parseInt(br.readLine());
            indexs[6]= Integer.parseInt(br.readLine());
            Bb3_answer[0]= Integer.parseInt(br.readLine());
            Bb3_answer[1]= Integer.parseInt(br.readLine());
            Bb3_answer[2]= Integer.parseInt(br.readLine());
            Bb3_answer[3]= Integer.parseInt(br.readLine());
            Bb3_answer[4]= Integer.parseInt(br.readLine());
            Bb3_answer[5]= Integer.parseInt(br.readLine());
            Bb3_answer[6]= Integer.parseInt(br.readLine());
            Bb3_answer[7]= Integer.parseInt(br.readLine());
            Cc1code[0][0]= Integer.parseInt(br.readLine());
            Cc1code[0][1]= Integer.parseInt(br.readLine());
            Cc1code[0][2]= Integer.parseInt(br.readLine());
            Cc1code[1][0]= Integer.parseInt(br.readLine());
            Cc1code[1][1]= Integer.parseInt(br.readLine());
            Cc1code[1][2]= Integer.parseInt(br.readLine());
            Cc1code[2][0]= Integer.parseInt(br.readLine());
            Cc1code[2][1]= Integer.parseInt(br.readLine());
            Cc1code[2][2]= Integer.parseInt(br.readLine());
            Cc1_mismatch= Integer.parseInt(br.readLine());
            indexs[7] = Integer.parseInt(br.readLine());
            Cc3_mismatch= Integer.parseInt(br.readLine());
            Cc3_answer= Integer.parseInt(br.readLine());
            indexs[8] = Integer.parseInt(br.readLine());
            Dd1d1code[0] = Integer.parseInt(br.readLine());
            Dd1d1code[1] = Integer.parseInt(br.readLine());
            Dd1d1code[2] = Integer.parseInt(br.readLine());
            Dd1d1code[3] = Integer.parseInt(br.readLine());
            Dd1d1answer[0] = Integer.parseInt(br.readLine());
            Dd1d1answer[1] = Integer.parseInt(br.readLine());
            Dd1d1answer[2] = Integer.parseInt(br.readLine());
            Dd1d1answer[3] = Integer.parseInt(br.readLine());
            indexs[10] = Integer.parseInt(br.readLine());
            indexs[11] = Integer.parseInt(br.readLine());
            E3code[0] = Integer.parseInt(br.readLine());
            E3code[1] = Integer.parseInt(br.readLine());
            E3code[2] = Integer.parseInt(br.readLine());
            E3code[3] = Integer.parseInt(br.readLine());
            E3answer[0] = Integer.parseInt(br.readLine());
            E3answer[1] = Integer.parseInt(br.readLine());
            E3answer[2] = Integer.parseInt(br.readLine());
            E3answer[3] = Integer.parseInt(br.readLine());
            indexs[12] = Integer.parseInt(br.readLine());
            indexs[13] = Integer.parseInt(br.readLine());
            indexs[14] = Integer.parseInt(br.readLine());
            indexs[15] = Integer.parseInt(br.readLine());
            E1code[0] = Integer.parseInt(br.readLine());
            E1code[1] = Integer.parseInt(br.readLine());
            E1code[2] = Integer.parseInt(br.readLine());
            E1code[3] = Integer.parseInt(br.readLine());
            E1code[4] = Integer.parseInt(br.readLine());
            E1answer[0] = Integer.parseInt(br.readLine());
            E1answer[1] = Integer.parseInt(br.readLine());
            E1answer[2] = Integer.parseInt(br.readLine());
            E1answer[3] = Integer.parseInt(br.readLine());
            E1answer[4] = Integer.parseInt(br.readLine());
            F1code[0] = Integer.parseInt(br.readLine());
            F1code[1] = Integer.parseInt(br.readLine());
            F1answer[0] = Integer.parseInt(br.readLine());
            F1answer[1] = Integer.parseInt(br.readLine());
            indexs[16] = Integer.parseInt(br.readLine());
            indexs[17] = Integer.parseInt(br.readLine());
            indexs[18] = Integer.parseInt(br.readLine());
            F2code[0] = Integer.parseInt(br.readLine());
            F2code[1] = Integer.parseInt(br.readLine());
            F2code[2] = Integer.parseInt(br.readLine());
            F2code[3] = Integer.parseInt(br.readLine());
            F2answer[0] = Integer.parseInt(br.readLine());
            F2answer[1] = Integer.parseInt(br.readLine());
            F2answer[2] = Integer.parseInt(br.readLine());
            F2answer[3] = Integer.parseInt(br.readLine());
            indexs[19] = Integer.parseInt(br.readLine());
            G1code[0] = Integer.parseInt(br.readLine());
            G1code[1] = Integer.parseInt(br.readLine());
            G1code[2] = Integer.parseInt(br.readLine());
            G1code[3] = Integer.parseInt(br.readLine());
            G1answer[0] = Integer.parseInt(br.readLine());
            G1answer[1] = Integer.parseInt(br.readLine());
            G1answer[2] = Integer.parseInt(br.readLine());
            G1answer[3] = Integer.parseInt(br.readLine());
            indexs[20] = Integer.parseInt(br.readLine());
            indexs[21] = Integer.parseInt(br.readLine());
            Aa3code[0] = Integer.parseInt(br.readLine());
            Aa3code[1] = Integer.parseInt(br.readLine());
            Aa3code[2] = Integer.parseInt(br.readLine());
            Aa3code[3] = Integer.parseInt(br.readLine());
            Aa3code[4] = Integer.parseInt(br.readLine());
            Aa3answer[0] = Integer.parseInt(br.readLine());
            Aa3answer[1] = Integer.parseInt(br.readLine());
            Aa3answer[2] = Integer.parseInt(br.readLine());
            Aa3answer[3] = Integer.parseInt(br.readLine());
            Aa3answer[4] = Integer.parseInt(br.readLine());
            indexs[23] = Integer.parseInt(br.readLine());
            indexs[24] = Integer.parseInt(br.readLine());
            indexs[25] = Integer.parseInt(br.readLine());
            things[1] = Integer.parseInt(br.readLine());
            C3_answer_help[0][0] = Integer.parseInt(br.readLine());
            C3_answer_help[0][1] = Integer.parseInt(br.readLine());
            C3_answer_help[0][2] = Integer.parseInt(br.readLine());
            C3_answer_help[0][3] = Integer.parseInt(br.readLine());
            C3_answer_help[0][4] = Integer.parseInt(br.readLine());
            C3_answer_help[0][5] = Integer.parseInt(br.readLine());
            C3_answer_help[1][0] = Integer.parseInt(br.readLine());
            C3_answer_help[1][1] = Integer.parseInt(br.readLine());
            C3_answer_help[1][2] = Integer.parseInt(br.readLine());
            C3_answer_help[1][3] = Integer.parseInt(br.readLine());
            C3_answer_help[1][4] = Integer.parseInt(br.readLine());
            C3_answer_help[1][5] = Integer.parseInt(br.readLine());
            System.out.println(door1_index+ " o");
            System.out.println(door_key1_index+ " s");
            System.out.println(door_key2_index + " g");
            br.close();
        }catch (Exception e){
            System.out.println("Fail Load");
        }
    }
    public void data_save(ActionEvent event) throws IOException  {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("SaveFile123.txt"));

            bw.write("" + door1_index);
            bw.newLine();
            bw.write(""+ door_key1_index );
            bw.newLine();
            bw.write(""+ door_key2_index );
            bw.newLine();
            bw.write(""+ inventory[0] );
            bw.newLine();
            bw.write(""+ inventory[1] );
            bw.newLine();
            bw.write(""+ inventory[2] );
            bw.newLine();
            bw.write(""+ indexs[1] );
            bw.newLine();
            bw.write(""+ indexs[2] );
            bw.newLine();
            bw.write(""+ Aa2buttons[0]);
            bw.newLine();
            bw.write(""+ Aa2buttons[1]);
            bw.newLine();
            bw.write(""+ Aa2buttons[2]);
            bw.newLine();
            bw.write(""+ Aa2buttons[3]);
            bw.newLine();
            bw.write(""+ Aa2code[0]);
            bw.newLine();
            bw.write(""+ Aa2code[1]);
            bw.newLine();
            bw.write(""+ Aa2code[2]);
            bw.newLine();
            bw.write(""+ Aa2code[3]);
            bw.newLine();
            bw.write(""+ indexs[3] );
            bw.newLine();
            bw.write(""+ Aa1code[0][0]);
            bw.newLine();
            bw.write(""+ Aa1code[0][1]);
            bw.newLine();
            bw.write(""+ Aa1code[0][2]);
            bw.newLine();
            bw.write(""+ Aa1code[0][3]);
            bw.newLine();
            bw.write(""+ Aa1code[1][0]);
            bw.newLine();
            bw.write(""+ Aa1code[1][1]);
            bw.newLine();
            bw.write(""+ Aa1code[1][2]);
            bw.newLine();
            bw.write(""+  Aa1code[1][3]);
            bw.newLine();
            bw.write(""+ Aa1code[2][0]);
            bw.newLine();
            bw.write(""+ Aa1code[2][1]);
            bw.newLine();
            bw.write(""+ Aa1code[2][2]);
            bw.newLine();
            bw.write(""+ Aa1code[2][3]);
            bw.newLine();
            bw.write(""+ Aa1answer[0][0]);
            bw.newLine();
            bw.write(""+ Aa1answer[0][1]);
            bw.newLine();
            bw.write(""+ Aa1answer[0][2]);
            bw.newLine();
            bw.write(""+ Aa1answer[0][3]);
            bw.newLine();
            bw.write(""+ Aa1answer[1][0]);
            bw.newLine();
            bw.write(""+ Aa1answer[1][1]);
            bw.newLine();
            bw.write(""+ Aa1answer[1][2]);
            bw.newLine();
            bw.write(""+  Aa1answer[1][3]);
            bw.newLine();
            bw.write(""+ Aa1answer[2][0]);
            bw.newLine();
            bw.write(""+ Aa1answer[2][1]);
            bw.newLine();
            bw.write(""+ Aa1answer[2][2]);
            bw.newLine();
            bw.write(""+ Aa1answer[2][3]);
            bw.newLine();
            bw.write(""+ indexs[4]);
            bw.newLine();
            bw.write(""+ indexs[5]);
            bw.newLine();
            bw.write(""+ indexs[6]);
            bw.newLine();
            bw.write(""+ Bb3_answer[0]);
            bw.newLine();
            bw.write(""+ Bb3_answer[1]);
            bw.newLine();
            bw.write(""+ Bb3_answer[2]);
            bw.newLine();
            bw.write(""+ Bb3_answer[3]);
            bw.newLine();
            bw.write(""+ Bb3_answer[4]);
            bw.newLine();
            bw.write(""+ Bb3_answer[5]);
            bw.newLine();
            bw.write(""+ Bb3_answer[6]);
            bw.newLine();
            bw.write(""+ Bb3_answer[7]);
            bw.newLine();
            bw.write(""+ Cc1code[0][0]);
            bw.newLine();
            bw.write(""+ Cc1code[0][1]);
            bw.newLine();
            bw.write(""+ Cc1code[0][2]);
            bw.newLine();
            bw.write(""+ Cc1code[1][0]);
            bw.newLine();
            bw.write(""+ Cc1code[1][1]);
            bw.newLine();
            bw.write(""+ Cc1code[1][2]);
            bw.newLine();
            bw.write(""+ Cc1code[2][0]);
            bw.newLine();
            bw.write(""+ Cc1code[2][1]);
            bw.newLine();
            bw.write(""+ Cc1code[2][2]);
            bw.newLine();
            bw.write(""+ Cc1_mismatch);
            bw.newLine();
            bw.write(""+ indexs[7]);
            bw.newLine();
            bw.write(""+ Cc3_mismatch);
            bw.newLine();
            bw.write(""+ Cc3_answer);
            bw.newLine();
            bw.write(""+ indexs[8]);
            bw.newLine();
            bw.write(""+ Dd1d1code[0]);
            bw.newLine();
            bw.write(""+ Dd1d1code[1]);
            bw.newLine();
            bw.write(""+ Dd1d1code[2]);
            bw.newLine();
            bw.write(""+ Dd1d1code[3]);
            bw.newLine();
            bw.write(""+ Dd1d1answer[0]);
            bw.newLine();
            bw.write(""+ Dd1d1answer[1]);
            bw.newLine();
            bw.write(""+ Dd1d1answer[2]);
            bw.newLine();
            bw.write(""+ Dd1d1answer[3]);
            bw.newLine();
            bw.write(""+ indexs[10]);
            bw.newLine();
            bw.write(""+ indexs[11]);
            bw.newLine();
            bw.write(""+ E3code[0]);
            bw.newLine();
            bw.write(""+ E3code[1]);
            bw.newLine();
            bw.write(""+ E3code[2]);
            bw.newLine();
            bw.write(""+ E3code[3]);
            bw.newLine();
            bw.write(""+ E3answer[0]);
            bw.newLine();
            bw.write(""+ E3answer[1]);
            bw.newLine();
            bw.write(""+ E3answer[2]);
            bw.newLine();
            bw.write(""+ E3answer[3]);
            bw.newLine();
            bw.write(""+ indexs[12]);
            bw.newLine();
            bw.write(""+ indexs[13]);
            bw.newLine();
            bw.write(""+ indexs[14]);
            bw.newLine();
            bw.write(""+ indexs[15]);
            bw.newLine();
            bw.write(""+ E1code[0]);
            bw.newLine();
            bw.write(""+ E1code[1]);
            bw.newLine();
            bw.write(""+ E1code[2]);
            bw.newLine();
            bw.write(""+ E1code[3]);
            bw.newLine();
            bw.write(""+ E1code[4]);
            bw.newLine();
            bw.write(""+ E1answer[0]);
            bw.newLine();
            bw.write(""+ E1answer[1]);
            bw.newLine();
            bw.write(""+ E1answer[2]);
            bw.newLine();
            bw.write(""+ E1answer[3]);
            bw.newLine();
            bw.write(""+ E1answer[4]);
            bw.newLine();
            bw.write(""+ F1code[0]);
            bw.newLine();
            bw.write(""+ F1code[1]);
            bw.newLine();
            bw.write(""+ F1answer[0]);
            bw.newLine();
            bw.write(""+ F1answer[1]);
            bw.newLine();
            bw.write(""+ indexs[16]);
            bw.newLine();
            bw.write(""+ indexs[17]);
            bw.newLine();
            bw.write(""+ indexs[18]);
            bw.newLine();
            bw.write(""+ F2code[0]);
            bw.newLine();
            bw.write(""+ F2code[1]);
            bw.newLine();
            bw.write(""+ F2code[2]);
            bw.newLine();
            bw.write(""+ F2code[3]);
            bw.newLine();
            bw.write(""+ F2answer[0]);
            bw.newLine();
            bw.write(""+ F2answer[1]);
            bw.newLine();
            bw.write(""+ F2answer[2]);
            bw.newLine();
            bw.write(""+ F2answer[3]);
            bw.newLine();
            bw.write(""+ indexs[19]);
            bw.newLine();
            bw.write(""+ G1code[0]);
            bw.newLine();
            bw.write(""+ G1code[1]);
            bw.newLine();
            bw.write(""+ G1code[2]);
            bw.newLine();
            bw.write(""+ G1code[3]);
            bw.newLine();
            bw.write(""+ G1answer[0]);
            bw.newLine();
            bw.write(""+ G1answer[1]);
            bw.newLine();
            bw.write(""+ G1answer[2]);
            bw.newLine();
            bw.write(""+ G1answer[3]);
            bw.newLine();
            bw.write(""+ indexs[20]);
            bw.newLine();
            bw.write(""+ indexs[21]);
            bw.newLine();
            bw.write(""+ Aa3code[0]);
            bw.newLine();
            bw.write(""+ Aa3code[1]);
            bw.newLine();
            bw.write(""+ Aa3code[2]);
            bw.newLine();
            bw.write(""+ Aa3code[3]);
            bw.newLine();
            bw.write(""+ Aa3code[4]);
            bw.newLine();
            bw.write(""+ Aa3answer[0]);
            bw.newLine();
            bw.write(""+ Aa3answer[1]);
            bw.newLine();
            bw.write(""+ Aa3answer[2]);
            bw.newLine();
            bw.write(""+ Aa3answer[3]);
            bw.newLine();
            bw.write(""+ Aa3answer[4]);
            bw.newLine();
            bw.write(""+ indexs[23]);
            bw.newLine();
            bw.write(""+ indexs[24]);
            bw.newLine();
            bw.write(""+ indexs[25]);
            bw.newLine();
            bw.write(""+ things[1]);
            bw.newLine();
            bw.write(""+ C3_answer_help[0][0]);
            bw.newLine();
            bw.write(""+ C3_answer_help[0][1]);
            bw.newLine();
            bw.write(""+ C3_answer_help[0][2]);
            bw.newLine();
            bw.write(""+ C3_answer_help[0][3]);
            bw.newLine();
            bw.write(""+ C3_answer_help[0][4]);
            bw.newLine();
            bw.write(""+ C3_answer_help[0][5]);
            bw.newLine();
            bw.write(""+ C3_answer_help[1][0]);
            bw.newLine();
            bw.write(""+ C3_answer_help[1][1]);
            bw.newLine();
            bw.write(""+ C3_answer_help[1][2]);
            bw.newLine();
            bw.write(""+ C3_answer_help[1][3]);
            bw.newLine();
            bw.write(""+ C3_answer_help[1][4]);
            bw.newLine();
            bw.write(""+ C3_answer_help[1][5]);


            bw.close();

        }catch (Exception e){

        }
    }

    public void data_reset()  {
        //BufferedWriter bw = new BufferedWriter(new FileWriter("SaveFile123.txt"));
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("SaveFile123.txt"));
            int reset = 0;
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write("" + reset);
            bw.newLine();
            bw.write(""+ reset);
            bw.newLine();
            bw.write(""+ reset);
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );
            bw.newLine();
            bw.write(""+ reset );

            bw.close();
        }catch (Exception e){

        }
        //bw.close();
    }

    public void door_key2_control(ActionEvent event) throws IOException {
        if(door_key2_index == 0){
            mediaPlayer.pause();
            help_int = 2;
            inventory_space_check();
            System.out.println(empty_space);
            if(empty_space == 0) {
                image1.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image1.setVisible(true);
                //inventory1.setText("Key2");
            } else if (empty_space == 1) {
                image2.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image2.setVisible(true);
                //image1.setStyle("-fx-image:url(https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSzzXCZ6r0M1HzcGn94CMjvh3fjuKQxwwRS7iUT46V2mS7Rufi7A1VQIo3f0mhDGCQxQOda7bpJKjhbxO20kqo46H1QU9peNiT5y9PYldMvXR-sf3_NxIe8nDMcSfDTPYUErm5prlWdm_a4l1ylZ0lcCJef-k0m-DwHcAeGVylvlXoE3BWkXFiCibEmQ/s16000/index-removebg-preview.png);");
                //image1.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                //inventory2.setText("Key2");
                //image1.setVisible(true);
            } else if (empty_space == 2) {
                image3.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image3.setVisible(true);
                //image2.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                //mage2.setVisible(true);;
            } else if (empty_space == 3) {
                image4.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image4.setVisible(true);
            } else if (empty_space == 4) {
                image5.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image5.setVisible(true);
            } else if (empty_space == 5) {
                image6.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image6.setVisible(true);
            } else if (empty_space == 6) {
                image7.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image7.setVisible(true);
            } else if (empty_space == 7) {
                image8.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image8.setVisible(true);
            } else if (empty_space == 8) {
                image9.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image9.setVisible(true);
            } else if (empty_space == 9) {
                image10.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image10.setVisible(true);
            } else if (empty_space == 10) {
                image11.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image11.setVisible(true);
            } else if (empty_space == 11) {
                image12.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image12.setVisible(true);
            } else if (empty_space == 12) {
                image13.setStyle("-fx-image:url(https://cdn-icons-png.flaticon.com/512/67/67785.png);");
                image13.setVisible(true);
            }
            empty_space = 0;
            help_int = 0;
            door_key2.setVisible(false);
            door_key2_index++;
        }
    }

    public static void inventory_space_check() throws IOException {
        for(int i = 0; i< inventory.length;i++ ) {
            if (inventory[i] == 0 ) {
                inventory[i] = help_int;
                break;
            }else{
                empty_space++;
            }
        }
    }

    public void inventory1_control(ActionEvent event) throws IOException {
        System.out.println(inventory[0]);
        if (actual_thing == inventory[0]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[0];
        }
        if(inventory[0] == 3){
            over_image.setVisible(true);
            over_image.setStyle("-fx-image:url('"+over1+"')");
            back.setVisible(true);
            One.setVisible(true);
            Two.setVisible(true);
            Three.setVisible(true);
            Four.setVisible(true);
            Five.setVisible(true);
            Six.setVisible(true);
        }
    }

    public void inventory2_control(ActionEvent event) throws IOException {
        System.out.println(inventory[1]);
        if (actual_thing == inventory[1]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[1];
        }
        if(inventory[1] == 3){
            over_image.setVisible(true);
            over_image.setStyle("-fx-image:url('"+over1+"')");
            back.setVisible(true);
            back.setVisible(true);
            One.setVisible(true);
            Two.setVisible(true);
            Three.setVisible(true);
            Four.setVisible(true);
            Five.setVisible(true);
            Six.setVisible(true);
        }
    }

    public void inventory3_control(ActionEvent event) throws IOException {
        System.out.println(inventory[2]);
        if (actual_thing == inventory[2]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[2];
        }
        if(inventory[2] == 3){
            over_image.setVisible(true);
            over_image.setStyle("-fx-image:url('"+over1+"')");
            back.setVisible(true);
            back.setVisible(true);
            One.setVisible(true);
            Two.setVisible(true);
            Three.setVisible(true);
            Four.setVisible(true);
            Five.setVisible(true);
            Six.setVisible(true);
        }
    }

    public void inventory4_control(ActionEvent event) throws IOException {
        System.out.println(inventory[3]);
        if (actual_thing == inventory[3]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[3];
        }
    }

    public void inventory5_control(ActionEvent event) throws IOException {
        System.out.println(inventory[4]);
        if (actual_thing == inventory[4]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[4];
        }
    }

    public void inventory6_control(ActionEvent event) throws IOException {
        System.out.println(inventory[5]);
        if (actual_thing == inventory[5]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[5];
        }
    }

    public void inventory7_control(ActionEvent event) throws IOException {
        System.out.println(inventory[6]);
        if (actual_thing == inventory[6]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[6];
        }
    }

    public void inventory8_control(ActionEvent event) throws IOException {
        System.out.println(inventory[7]);
        if (actual_thing == inventory[7]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[7];
        }
    }
    public void inventory9_control(ActionEvent event) throws IOException {
        System.out.println(inventory[8]);
        if (actual_thing == inventory[8]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[8];
        }
    }

    public void inventory10_control(ActionEvent event) throws IOException {
        System.out.println(inventory[9]);
        if (actual_thing == inventory[9]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[9];
        }
    }

    public void inventory11_control(ActionEvent event) throws IOException {
        System.out.println(inventory[10]);
        if (actual_thing == inventory[10]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[10];
        }

    }
    public void inventory12_control(ActionEvent event) throws IOException {
        System.out.println(inventory[11]);
        if (actual_thing == inventory[11]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[11];
        }
    }

    public void inventory13_control(ActionEvent event) throws IOException {
        System.out.println(inventory[12]);
        if (actual_thing == inventory[12]) {
            actual_thing = 0;
        } else {
            previous_actual_thing = actual_thing;
            actual_thing = inventory[12];
        }
    }

    public void backonAction(ActionEvent event) throws IOException {
        over_image.setVisible(false);
        back.setVisible(false);
        actual_thing = 0;
        One.setVisible(false);
        Two.setVisible(false);
        Three.setVisible(false);
        Four.setVisible(false);
        Five.setVisible(false);
        Six.setVisible(false);
    }


}