package ru.netology.domain;

public class Post {
    private long id;
    private long ownerId;
    private long fromId;
    private int date;
    private String text;
    private String copyright;
    private String postType;
    private boolean canPin;
    private boolean canDelete;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private CommentsInfo commentsInfo;
    private ViewsInfo viewsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public long getOwnerId() {

        return ownerId;
    }

    public void setOwnerId(long ownerId) {

        this.ownerId = ownerId;
    }

    public long getFromId() {

        return fromId;
    }

    public void setFromId(long fromId) {

        this.fromId = fromId;
    }

    public int getDate() {

        return date;
    }

    public void setDate(int date) {

        this.date = date;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getCopyright() {

        return copyright;
    }


    public void setCopyright(String copyright) {

        this.copyright = copyright;
    }

    public String getPostType() {

        return postType;
    }


    public void setPostType(String postType) {

        this.postType = postType;
    }

    public boolean isCanPin() {

        return canPin;
    }


    public void setCanPin(boolean canPin) {

        this.canPin = canPin;
    }


    public boolean isCanDelete() {

        return canDelete;
    }


    public void setCanDelete(boolean canDelete) {

        this.canDelete = canDelete;
    }

    public int getIsPinned() {

        return isPinned;
    }


    public void setIsPinned(int isPinned) {

        this.isPinned = isPinned;
    }


    public int getMarkedAsAds() {

        return markedAsAds;
    }


    public void setMarkedAsAds(int markedAsAds) {

        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {

        return isFavorite;
    }


    public void setFavorite(boolean favorite) {

        isFavorite = favorite;
    }

    public CommentsInfo getCommentsInfo() {

        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {

        this.commentsInfo = commentsInfo;
    }

    public ViewsInfo getViewsInfo() {

        return viewsInfo;
    }


    public void setViewsInfo(ViewsInfo viewsInfo) {

        this.viewsInfo = viewsInfo;
    }

    public LikesInfo getLikeInfo() {

        return likesInfo;
    }


    public void setLikeInfo(LikesInfo likesInfo) {

        this.likesInfo = likesInfo;
    }

    public RepostInfo getRepostInfo() {

        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {

        this.repostInfo = repostInfo;
    }
}
