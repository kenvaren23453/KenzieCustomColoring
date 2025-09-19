package edu.up.kenziecustomcoloring;
/**
 * @Author: McKenzie Varenhorst
 * Due Date: 2025-09-18
 * References:
 * https://developer.android.com/develop/ui/views/layout/custom-views/custom-drawing
 * https://developer.android.com/reference/android/graphics/Canvas
 * https://developer.android.com/develop/ui/views/layout/declaring-layout - used for activity_main.xml
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;


public class BreakfastView extends SurfaceView {

    private Paint eggWhitePaint;
    private Paint yolkPaint;
    private Paint platePaint;
    private Paint baconPaint;

    public BreakfastView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // onDraw called
        setWillNotDraw(false);

        platePaint = new Paint();
        platePaint.setColor(Color.rgb(200, 220, 255));

        eggWhitePaint = new Paint();
        eggWhitePaint.setColor(Color.WHITE);

        yolkPaint = new Paint();
        yolkPaint.setColor(Color.YELLOW);

     baconPaint = new Paint();
     baconPaint.setColor(Color.rgb(165, 42, 42));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //  background
        canvas.drawColor(Color.LTGRAY);

//      plate -
        float w = getWidth();
        float h = getHeight();
        canvas.drawOval(w * 0.15f, h * 0.25f, w * 0.85f, h * 0.75f, platePaint);

        // Egg 1 (white + yolk)
        canvas.drawOval(w * 0.30f, h * 0.40f, w * 0.45f, h * 0.50f, eggWhitePaint);
        canvas.drawOval(w * 0.35f, h * 0.43f, w * 0.40f, h * 0.47f, yolkPaint);

        // Egg 2 (white + yolk)
        canvas.drawOval(w * 0.55f, h * 0.40f, w * 0.70f, h * 0.50f, eggWhitePaint);
        canvas.drawOval(w * 0.60f, h * 0.43f, w * 0.65f, h * 0.47f, yolkPaint);

        //  3 - Draw bacon-
        // Bacon strip 1
        canvas.drawRoundRect(w * 0.25f, h * 0.60f, w * 0.45f, h * 0.65f,
                20f, 20f, baconPaint);

        // Bacon strip 2
        canvas.drawRoundRect(w * 0.55f, h * 0.60f, w * 0.75f, h * 0.65f,
                20f, 20f, baconPaint);

        // Juice - ?


    }
}
