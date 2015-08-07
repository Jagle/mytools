package com.wukongtv.wkhelper.CleanCache; class a { void a() { int a;
a=0;// .class public final Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/util/List;
a=0;// 
a=0;// .field b:Ljava/util/List;
a=0;// 
a=0;// .field c:Ljava/lang/String;
a=0;// 
a=0;// .field d:J
a=0;// 
a=0;// .field e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;// .field public f:Ljava/lang/Thread;
a=0;// 
a=0;// .field g:J
a=0;// 
a=0;// .field private h:Ljava/util/regex/Pattern;
a=0;// 
a=0;// .field private i:Ljava/util/regex/Pattern;
a=0;// 
a=0;// .field private j:Ljava/lang/String;
a=0;// 
a=0;// .field private k:Ljava/lang/String;
a=0;// 
a=0;// .field private l:Ljava/lang/String;
a=0;// 
a=0;// .field private m:Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     const-string v0, "^\\S+\\.apk$"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->h:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     const-string v0, "(^\\S+cache)|(^\\S+log)|(^\\S+temp)"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->i:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->a:Ljava/util/List;
a=0;// 
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->b:Ljava/util/List;
a=0;// 
a=0;//     const-string v0, "cache_file"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "apk_file"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->k:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "cache_size"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->l:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/CleanCache/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/CleanCache/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/CleanCache/b;-><init>(Lcom/wukongtv/wkhelper/CleanCache/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/b;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->f:Ljava/lang/Thread;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/CleanCache/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/CleanCache/c;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/CleanCache/c;-><init>(Lcom/wukongtv/wkhelper/CleanCache/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/c;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->m:Ljava/lang/Thread;
a=0;// 
a=0;//     iput-wide v2, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     iput-wide v2, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     iput-wide v2, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     const-string v0, "^\\S+\\.apk$"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->h:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     const-string v0, "(^\\S+cache)|(^\\S+log)|(^\\S+temp)"
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->i:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->a:Ljava/util/List;
a=0;// 
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->b:Ljava/util/List;
a=0;// 
a=0;//     const-string v0, "cache_file"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "apk_file"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->k:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "cache_size"
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->l:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/CleanCache/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/CleanCache/b;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/CleanCache/b;-><init>(Lcom/wukongtv/wkhelper/CleanCache/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/b;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->f:Ljava/lang/Thread;
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/CleanCache/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/CleanCache/c;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/CleanCache/c;-><init>(Lcom/wukongtv/wkhelper/CleanCache/a;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/c;);
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->m:Ljava/lang/Thread;
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/File;)J
a=0;//     .locals 7
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     array-length v6, v3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v2, v6, :cond_0
a=0;// 
a=0;//     aget-object v4, v3, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     add-long/2addr v4, v0
a=0;// 
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     move-wide v0, v4
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/File;Ljava/util/regex/Pattern;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;I)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt p1, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     array-length v3, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v3, :cond_3
a=0;// 
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v4=(Null);v5=(Boolean);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v5, p1, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     :cond_5
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final a()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->b:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->a:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final a(Ljava/io/File;I)V
a=0;//     .locals 8
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt p2, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->i:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-static {v3, v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/io/File;Ljava/util/regex/Pattern;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/CleanCache/e;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-interface {v4, v3, v6, v7}, Lcom/wukongtv/wkhelper/CleanCache/e;->a(Ljava/io/File;J)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->b:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/CleanCache/e;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x1
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     iput-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     iget-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     cmp-long v3, v4, v6
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     iget-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     iget-wide v6, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     cmp-long v3, v4, v6
a=0;// 
a=0;//     if-gtz v3, :cond_4
a=0;// 
a=0;//     iget-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->g:J
a=0;// 
a=0;//     long-to-float v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     long-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v3, v4
a=0;// 
a=0;//     new-instance v4, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v5, "#.#"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/text/DecimalFormat;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/high16 v6, 0x42c80000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-float/2addr v3, v6
a=0;// 
a=0;//     float-to-double v6, v3
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     invoke-virtual {v4, v6, v7}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "%"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v4, v3}, Lcom/wukongtv/wkhelper/CleanCache/e;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Null);v4=(Boolean);
a=0;//     add-int/lit8 v4, p2, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/io/File;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v4=(Boolean);
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->h:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-static {v3, v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/io/File;Ljava/util/regex/Pattern;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->a:Ljava/util/List;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->e:Lcom/wukongtv/wkhelper/CleanCache/e;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/wukongtv/wkhelper/CleanCache/a;->a(Ljava/io/File;)J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-interface {v4, v3, v6, v7}, Lcom/wukongtv/wkhelper/CleanCache/e;->b(Ljava/io/File;J)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/io/File;I)J
a=0;//     .locals 8
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-lt p2, v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-wide v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/io/File;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     array-length v2, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x1
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     iput-wide v4, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     add-int/lit8 v4, p2, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v3, v4}, Lcom/wukongtv/wkhelper/CleanCache/a;->b(Ljava/io/File;I)J
a=0;// 
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-wide v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->d:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->m:Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/CleanCache/a;->m:Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
