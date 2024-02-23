class Solution {
  public int maxArea(int[] height) {
      
      int length = height.length;
      boolean isEven = length % 2 == 0;
      int halfIndex = length / 2;
      int innerHalfIndex = isEven ? halfIndex : halfIndex + 1;

      int max = isEven ? calArea(height, halfIndex - 1, halfIndex) : 0;
      int tempMax = 0;

      for (int i = 0; i < halfIndex; i++) {
          tempMax = calArea(height, i, length - i - 1);
          max = tempMax > max ? tempMax : max;

          for (int innerI = (i+1); innerI < innerHalfIndex; innerI++) {
              tempMax = calArea(height, i, innerI);
              max = tempMax > max ? tempMax : max;
              
              tempMax = calArea(height, (length - i - 1), (length - 1 - innerI));
              max = tempMax > max ? tempMax : max;

              tempMax = calArea(height, i, length - 1 - innerI);
              max = tempMax > max ? tempMax : max;

              tempMax = calArea(height, (length - i - 1), innerI);
              max = tempMax > max ? tempMax : max;
          }

      }

      return max;
  }

  private int calArea(int[] arr, int a, int b) {
      int area = ( arr[a] < arr[b] ? arr[a] : arr[b] ) * (a - b);
      return area < 0 ? (-1 * area) : area;
  }
}