import javafx.scene.image.ImageView;

/**
 * The AnimatedImageView Class
 * This class stores an animation, by storing many frames of a picture. This is used in the WaterWorks program to show animations of the character moving on the spot.
 * @author Maria Yampolsky and Vansh Juneja
 * @version 5 06.05.2019
 *
 * <pre>
 * Version History:
 * May 26:
 * This class was written by copying the AnimatedImage class but returning ImageView objects from the getFrame() and lastFrame() objects.
 * May 29:
 * Vansh redid the class to no longer store an array of ImageView objects, but to store a path location and a frame number. The instance methods and constructor were rewritten to accomodate for this change, and now do not return items using indexes of an array, but return items using the path location.
 *
 * </pre>
 */
class AnimatedImageView
{

    /**
     * The path location of the files in which the frames of the animation are stored.
     */
    private final String path;

    /**
     * The number of frames in the animation.
     */
    private final int numFrames;

    /**
     * The duration of the animation.
     */
    private final double duration;

    /**
     * The constructor of the AnimatedImageView class, which creates an object of the class.
     * @param path The path where the images used for the animation are located
     * @param nframes The number of frames in the animation
     * @param duratn The duration of the animation
     */
    public AnimatedImageView (String path, int nframes, double duratn) {
        this.path = path;
        duration = duratn;
        numFrames = nframes;
    }

    /**
     * The getFrame() method, which returns the frame of an animation based off of the time entered.
     * @param time The time into the animation, determines which frame the animation is on
     * @return An ImageView object that represents the frame that the animation is currently on
     */
    public ImageView getFrame(double time) {
        int index = Math.max((int)((time % (numFrames * duration)) / duration), 1);
        return new ImageView(path + " (" + index + ").png");
    }

}
