/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import DataConstructor.DynamicArray;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import com.teamdev.jxmaps.swing.MapView;
import com.teamdev.jxmaps.*;
import java.util.concurrent.TimeUnit;

public class Mapa extends MapView{
    
    //vẽ Map
    private static Map map;
    
    // thông số vẽ hình tròn
    private CircleOptions circleOptions;
    
    // thông số vẽ đường thẳng
    private PolylineOptions lineOptions;
    
    
    public void generateSimplePath(LatLng[] path){
        Polyline polyline = new Polyline(map);
        polyline.setPath(path);
        polyline.setOptions(lineOptions);
    }

    public void generateCircle(LatLng center){
        Circle circle = new Circle(map);
        circle.setCenter(center);
        circle.setRadius(20);
        circle.setVisible(true);
        circle.setOptions(circleOptions);
        
    }
    
    public Mapa(DynamicArray<LatLng[]> edgeArray){
    
    }
}
