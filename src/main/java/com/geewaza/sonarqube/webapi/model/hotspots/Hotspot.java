package com.geewaza.sonarqube.webapi.model.hotspots;

import com.geewaza.sonarqube.webapi.model.component.Component;
import com.geewaza.sonarqube.webapi.model.component.Project;
import com.geewaza.sonarqube.webapi.model.issue.Changelog;
import com.geewaza.sonarqube.webapi.model.issue.Comment;
import com.geewaza.sonarqube.webapi.model.issue.Rule;
import com.geewaza.sonarqube.webapi.model.user.User;
import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-12-01 10:59
 **/
public class Hotspot {

    private String key;

    private Component component;

    private Project project;

    private Rule rule;

    private String status;

    private Integer line;

    private String hash;

    private String message;

    private String assignee;

    private String author;

    private Date creationDate;

    private Date updateDate;

    private Changelog[] changelog;

    private Comment[] comment;

    private User[] users;

    private Boolean canChangeStatus;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Changelog[] getChangelog() {
        return changelog;
    }

    public void setChangelog(Changelog[] changelog) {
        this.changelog = changelog;
    }

    public Comment[] getComment() {
        return comment;
    }

    public void setComment(Comment[] comment) {
        this.comment = comment;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Boolean getCanChangeStatus() {
        return canChangeStatus;
    }

    public void setCanChangeStatus(Boolean canChangeStatus) {
        this.canChangeStatus = canChangeStatus;
    }
}
