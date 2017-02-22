package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** image resource ID  */
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;

    //** Audio resource ID */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int imageResourceID, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceId = audioResourceId;
    }


    @Override
    public String toString() {
        return "Word{" +
                "mImageResourceID=" + mImageResourceID +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //Get image resource ID
    public int getImageResourceID(){
        return mImageResourceID;
    }

    /** Return image if exists */
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /** Return the sound of each word */
    public int getAudioResourceId(){return mAudioResourceId;}

}
