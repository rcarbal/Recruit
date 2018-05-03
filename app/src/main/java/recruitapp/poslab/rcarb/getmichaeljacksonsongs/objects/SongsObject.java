package recruitapp.poslab.rcarb.getmichaeljacksonsongs.objects;

import android.os.Parcel;
import android.os.Parcelable;

public class SongsObject implements Parcelable{
    public SongsObject() {
    }

    private String mWrapperType;
    private String mKind;
    private int mArtistId;
    private int mCollectionId;
    private int mTrackId;
    private String mArtistName;
    private String mCollectionName;
    private String mTrackName;
    private String mCollectionCensoredName;
    private String mTrackCensoredName;
    private String mArtistViewUrl;
    private String mCollectionViewUrl;
    private String mTrackViewUrl;
    private String mPreviewUrl;
    private String mArtworkUrl30;
    private String mArtworkUrl60;
    private String mArtworkUrl100;
    private long mCollectionPrice;
    private long mTrackPrice;
    private String mReleaseDate;
    private String mCollectionExplicitness;
    private String mTrackExplicitness;
    private int mDiscCount;
    private int mDiscNumber;
    private int mTrackCount;
    private int mTrackNumber;
    private long mTrackTimeMillis;
    private String mCountry;
    private String mCurrency;
    private String mPrimaryGenreName;
    private boolean mIsStreamable;

    private SongsObject(Parcel in) {
        mWrapperType = in.readString();
        mKind = in.readString();
        mArtistId = in.readInt();
        mCollectionId = in.readInt();
        mTrackId = in.readInt();
        mArtistName = in.readString();
        mCollectionName = in.readString();
        mTrackName = in.readString();
        mCollectionCensoredName = in.readString();
        mTrackCensoredName = in.readString();
        mArtistViewUrl = in.readString();
        mCollectionViewUrl = in.readString();
        mTrackViewUrl = in.readString();
        mPreviewUrl = in.readString();
        mArtworkUrl30 = in.readString();
        mArtworkUrl60 = in.readString();
        mArtworkUrl100 = in.readString();
        mCollectionPrice = in.readLong();
        mTrackPrice = in.readLong();
        mReleaseDate = in.readString();
        mCollectionExplicitness = in.readString();
        mTrackExplicitness = in.readString();
        mDiscCount = in.readInt();
        mDiscNumber = in.readInt();
        mTrackCount = in.readInt();
        mTrackNumber = in.readInt();
        mTrackTimeMillis = in.readLong();
        mCountry = in.readString();
        mCurrency = in.readString();
        mPrimaryGenreName = in.readString();
        mIsStreamable = in.readByte() != 0;
    }

    public static final Creator<SongsObject> CREATOR = new Creator<SongsObject>() {
        @Override
        public SongsObject createFromParcel(Parcel in) {
            return new SongsObject(in);
        }

        @Override
        public SongsObject[] newArray(int size) {
            return new SongsObject[size];
        }
    };

    public void setWrapperType(String wrapperType) {
        mWrapperType = wrapperType;
    }

    public String getWrapperType() {
        return mWrapperType;
    }

    public void setKind(String kind) {
        mKind = kind;
    }

    public String getKind() {
        return mKind;
    }

    public void setArtistId(int artistId) {
        mArtistId = artistId;
    }

    public int getArtistId() {
        return mArtistId;
    }

    public void setCollectionId(int collectionId) {
        mCollectionId = collectionId;
    }

    public int getCollectionId() {
        return mCollectionId;
    }

    public void setTrackId(int trackId) {
        mTrackId = trackId;
    }

    public int getTrackId() {
        return mTrackId;
    }

    public void setArtistName(String artistName) {
        mArtistName = artistName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public void setCollectionName(String collectionName) {
        mCollectionName = collectionName;
    }

    public String getCollectionName() {
        return mCollectionName;
    }

    public void setTrackName(String trackName) {
        mTrackName = trackName;
    }

    public String getTrackName() {
        return mTrackName;
    }

    public void setCollectionCensoredNmae(String collectionCencoredName) {
        mCollectionCensoredName = collectionCencoredName;
    }

    public String getmCollectionCensoredName() {
        return mCollectionCensoredName;
    }

    public void setTrackCensoredName(String trackCensoredName) {
        mTrackCensoredName = trackCensoredName;
    }

    public String getTrackCensoredName() {
        return mTrackCensoredName;
    }


    public void setArtistViewUrl(String artisitViewUrl) {
        mArtistViewUrl = artisitViewUrl;
    }

    public String getArtistViewUrl() {
        return mArtistViewUrl;
    }

    public void setCollectionViewUrl(String collectionViewUrl) {
        mCollectionViewUrl = collectionViewUrl;
    }

    public String getCollectionViewUrl() {
        return mCollectionViewUrl;
    }

    public void setTrackViewUrl(String trackViewUrl) {
        mTrackViewUrl = trackViewUrl;
    }

    public String getTrackViewUrl() {
        return mTrackViewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        mPreviewUrl = previewUrl;
    }

    public String getPreviewUrl() {
        return mPreviewUrl;
    }


    public void setArtworkUrl130(String artWorkUrl130) {
        mArtworkUrl30 = artWorkUrl130;
    }

    public String getArtworkUrl130() {
        return mArtworkUrl30;
    }

    public void setArtworkUrl160(String artWorkUrl160) {
        mArtworkUrl60 = artWorkUrl160;
    }

    public String getArtworkUrl60() {
        return mArtworkUrl60;
    }

    public void setArtworkUrl100(String artWorkUrl100) {
        mArtworkUrl100 = artWorkUrl100;
    }

    public String getArtworkUrl100() {
        return mArtworkUrl100;
    }

    public void setCollectionPrice(long collectionPrice) {
        mCollectionPrice = collectionPrice;
    }

    public long getCollectionPrice() {
        return mCollectionPrice;
    }

    public void setTrackPrice(long trackPrice) {
        mTrackPrice = trackPrice;
    }

    public long getTrackPrice() {
        return mTrackPrice;
    }

    public void setReleaseDate(String releaseDate) {
        mReleaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setCollectionExplicitness(String collectionExplicitness) {
        mCollectionExplicitness = collectionExplicitness;
    }

    public String getCollectionExplicitness() {
        return mCollectionExplicitness;
    }

    public void setTrackExplicitness(String trackExplicitness) {
        mTrackExplicitness = trackExplicitness;
    }

    public String getTrackExplicitness() {
        return mTrackExplicitness;
    }

    public void setDiscCount(int discCount) {
        mDiscCount = discCount;
    }

    public int getDisCcount() {
        return mDiscCount;
    }


    public void setDiscNumber(int discNumer) {
        mDiscNumber = discNumer;
    }

    public int getDiscNumber() {
        return mDiscNumber;
    }

    public void setTrackCount(int trackCount) {
        mTrackCount = trackCount;
    }

    public int getTrackCount() {
        return mTrackCount;
    }
    public void setTrackNumber(int trackNumber) {
        mTrackNumber = trackNumber;
    }

    public int getTrackNumber() {
        return mTrackNumber;
    }

    public void setTrackTimeMillis(long trackTimeMillis) {
        mTrackTimeMillis = trackTimeMillis;
    }

    public long getTrackTimeMillis() {
        return mTrackTimeMillis;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setPrimaryGenreName(String primaryGenreName) {
        mPrimaryGenreName= primaryGenreName;
    }

    public String getPrimaryGenreName() {
        return mPrimaryGenreName;
    }
    public boolean setIsStreamable(boolean isStreamable) {
       return mIsStreamable = isStreamable;
    }

    public boolean geIsStreamable() {
        return mIsStreamable;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mWrapperType);
        dest.writeString(mKind);
        dest.writeInt(mArtistId);
        dest.writeInt(mCollectionId);
        dest.writeInt(mTrackId);
        dest.writeString(mArtistName);
        dest.writeString(mCollectionName);
        dest.writeString(mTrackName);
        dest.writeString(mCollectionCensoredName);
        dest.writeString(mTrackCensoredName);
        dest.writeString(mArtistViewUrl);
        dest.writeString(mCollectionViewUrl);
        dest.writeString(mTrackViewUrl);
        dest.writeString(mPreviewUrl);
        dest.writeString(mArtworkUrl30);
        dest.writeString(mArtworkUrl60);
        dest.writeString(mArtworkUrl100);
        dest.writeLong(mCollectionPrice);
        dest.writeLong(mTrackPrice);
        dest.writeString(mReleaseDate);
        dest.writeString(mCollectionExplicitness);
        dest.writeString(mTrackExplicitness);
        dest.writeInt(mDiscCount);
        dest.writeInt(mDiscNumber);
        dest.writeInt(mTrackCount);
        dest.writeInt(mTrackNumber);
        dest.writeLong(mTrackTimeMillis);
        dest.writeString(mCountry);
        dest.writeString(mCurrency);
        dest.writeString(mPrimaryGenreName);
        dest.writeByte((byte) (mIsStreamable ? 1 : 0));
    }
}
