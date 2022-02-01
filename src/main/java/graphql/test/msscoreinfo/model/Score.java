package graphql.test.msscoreinfo.model;

public class Score {
    private Integer gitlabUserId;
    private Float score;

    public Score(Integer gitlabUserId, Float score) {
        this.gitlabUserId = gitlabUserId;
        this.score = score;
    }

    public Integer getGitlabUserId() {
        return gitlabUserId;
    }

    public void setGitlabUserId(Integer gitlabUserId) {
        this.gitlabUserId = gitlabUserId;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }
}
