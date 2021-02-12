package ru.netology.domain.attachment;

import ru.netology.domain.LikesInfo;
import ru.netology.domain.RepostsInfo;

public class Video {
    private int id;
    private int owner_id;
    private String title;
    private String description;
    private int duration;
    private int date;
    private int adding_date;
    private int views;
    private int local_views;
    private int comments;
    private String player;
    private String platform;
    private int canEdit;
    private int canAdd;
    private int isPrivate;
    private String accessKey;
    private int processing;
    private boolean isFavorite;
    private int canComment;
    private int canLike;
    private int canRepost;
    private int canSubscribe;
    private int canAddToFaves;
    private int canAttachLink;
    private int width;
    private int height;
    private int userId;
    private int converting;
    private int added;
    private int isSubscribed;
    private int repeat;
    private String type;
    private int balance;
    private String liveStatus;
    private int live;
    private int upcoming;
    private int spectators;
    private LikesInfo likes;
    private RepostsInfo reposts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAdding_date() {
        return adding_date;
    }

    public void setAdding_date(int adding_date) {
        this.adding_date = adding_date;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLocal_views() {
        return local_views;
    }

    public void setLocal_views(int local_views) {
        this.local_views = local_views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(int canAdd) {
        this.canAdd = canAdd;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public int getProcessing() {
        return processing;
    }

    public void setProcessing(int processing) {
        this.processing = processing;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getCanComment() {
        return canComment;
    }

    public void setCanComment(int canComment) {
        this.canComment = canComment;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(int canRepost) {
        this.canRepost = canRepost;
    }

    public int getCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(int canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public int getCanAddToFaves() {
        return canAddToFaves;
    }

    public void setCanAddToFaves(int canAddToFaves) {
        this.canAddToFaves = canAddToFaves;
    }

    public int getCanAttachLink() {
        return canAttachLink;
    }

    public void setCanAttachLink(int canAttachLink) {
        this.canAttachLink = canAttachLink;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getConverting() {
        return converting;
    }

    public void setConverting(int converting) {
        this.converting = converting;
    }

    public int getAdded() {
        return added;
    }

    public void setAdded(int added) {
        this.added = added;
    }

    public int getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(int isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(int upcoming) {
        this.upcoming = upcoming;
    }

    public int getSpectators() {
        return spectators;
    }

    public void setSpectators(int spectators) {
        this.spectators = spectators;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public void setLikes(LikesInfo likes) {
        this.likes = likes;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public void setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
    }
}
