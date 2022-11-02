package AutoVehiculPackage;

import java.util.ArrayList;

public class Utilitar {
      public static double mediePreturiMasini(ArrayList<Masina> arr){
          int i=0;
          double sum=0;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
               sum += arr.get(i).getPret();
          }
          return sum/arr.size();
      }
      public static double mediePreturiMotociclete(ArrayList<Motocicleta> arr){
          int i=0;
          double sum=0;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
              sum += arr.get(i).getPret();
          }
          return sum/arr.size();
      }
      public static double mediePreturiCamionane(ArrayList<Camion> arr){
          int i=0;
          double sum=0;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
              sum += arr.get(i).getPret();
          }
          return sum/arr.size();
      }

      public static int pretMinMasini(ArrayList<Masina> arr){
          int i=0;
          int min=999999;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
              if(arr.get(i).getPret()<min)min=arr.get(i).getPret();
          }
          return min;
      }

      public static int pretMinMotociclete(ArrayList<Motocicleta> arr){
          int i=0;
          int min=999999;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
              if(arr.get(i).getPret()<min)min=arr.get(i).getPret();
          }
          return min;
      }

      public static int pretMinCamioane(ArrayList<Camion> arr){
          int i=0;
          int min=999999;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
              if(arr.get(i).getPret()<min)min=arr.get(i).getPret();
          }
          return min;
      }

      public static int pretMaxMasini(ArrayList<Masina> arr){
         int i=0;
         int max=0;
         for(i=0;i<arr.size() && arr.get(i) != null;i++){
             if(arr.get(i).getPret()>max)max=arr.get(i).getPret();
         }
         return max;
      }
      public static int pretMaxMotociclete(ArrayList<Motocicleta> arr){
          int i=0;
          int max=0;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
              if(arr.get(i).getPret()>max)max=arr.get(i).getPret();
          }
          return max;
      }
      public static int pretMaxCamioane(ArrayList<Camion> arr){
          int i=0;
          int max=0;
          for(i=0;i<arr.size() && arr.get(i) != null;i++){
              if(arr.get(i).getPret()>max)max=arr.get(i).getPret();
          }
          return max;
      }
}
