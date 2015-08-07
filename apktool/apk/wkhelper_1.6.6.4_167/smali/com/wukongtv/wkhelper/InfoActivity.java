package com.wukongtv.wkhelper; class InfoActivity { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/InfoActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/InfoActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/wukongtv/wkhelper/InfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const v0, 0x7f0b0032
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const v0, 0x7f0b0033
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/InfoActivity;ILjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/io/File;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-wide/32 v10, 0x100000
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     const v7, 0x7f0b0012
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     const v0, 0x7f030001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/InfoActivity;->setContentView(I)V
a=0;// 
a=0;//     const v0, 0x7f0b000d
a=0;// 
a=0;//     const-string v2, "MODEL"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v2, v4}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v0, 0x7f0b000e
a=0;// 
a=0;//     const-string v2, "HOST"
a=0;// 
a=0;//     sget-object v4, Landroid/os/Build;->HOST:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, v0, v2, v4}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v0, 0x7f0b000f
a=0;// 
a=0;//     const-string v2, "ADB"
a=0;// 
a=0;//     const-string v4, "checking..."
a=0;// 
a=0;//     invoke-direct {p0, v0, v2, v4}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/c;);
a=0;//     invoke-direct {v0, p0}, Lcom/wukongtv/wkhelper/c;-><init>(Lcom/wukongtv/wkhelper/InfoActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/c;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     const v2, 0x7f0b0010
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v4, "ROOT"
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/m;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "YES"
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v2, v4, v0}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v4, 0x7f0b0011
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const-string v5, "CONTROL"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/controller/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sparse-switch v6, :sswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Byte);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-direct {p0, v4, v5, v0}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "com.wukongtv.wkhelper.remoteplugin"
a=0;// 
a=0;//     invoke-static {v0, p0}, Lcom/wukongtv/wkhelper/a/j;->b(Ljava/lang/String;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "PLUGIN"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "OLD"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v7, v0, v1}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/c/z;->a()Lcom/wukongtv/wkhelper/c/z;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "https://www.baidu.com/"
a=0;// 
a=0;//     new-instance v2, Lcom/wukongtv/wkhelper/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/wukongtv/wkhelper/b;);
a=0;//     invoke-direct {v2, p0}, Lcom/wukongtv/wkhelper/b;-><init>(Lcom/wukongtv/wkhelper/InfoActivity;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/b;);
a=0;//     invoke-virtual {v0, v1, v8, v2}, Lcom/wukongtv/wkhelper/c/z;->a(Ljava/lang/String;Lcom/b/a/a/z;Lcom/b/a/a/ac;)V
a=0;// 
a=0;//     const v0, 0x7f0b0014
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-string v1, "CHANNEL"
a=0;// 
a=0;//     invoke-static {p0}, Lcom/wukongtv/b/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v0, 0x7f0b0015
a=0;// 
a=0;//     const-string v1, "STORAGE"
a=0;// 
a=0;//     const-string v2, "\u25bd"
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v1, 0x7f0b0016
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     const-string v0, "wkapk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "wk.apk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "Download"
a=0;// 
a=0;//     invoke-static {v5}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v6, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v6}, Lcom/wukongtv/wkhelper/InfoActivity;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v6, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/o;->c()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v4, v10
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "  "
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "M"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v5=(Conflicted);
a=0;//     invoke-direct {p0, v1, v2, v0}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v1, 0x7f0b0017
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     const-string v0, "wkapk"
a=0;// 
a=0;//     const-string v4, "wk.apk"
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/o;->c()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     div-long/2addr v6, v10
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     new-instance v8, Ljava/io/File;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v8, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/File;);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     invoke-static {v8}, Lcom/wukongtv/wkhelper/InfoActivity;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v8, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "  "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "M"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_5
a=0;//     invoke-direct {p0, v1, v2, v0}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v0, 0x7f0b0018
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "wk.apk"
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/o;->b()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     div-long/2addr v6, v10
a=0;// 
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v5, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "  "
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "M"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v2}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const v0, 0x7f0b0019
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/wukongtv/wkhelper/InfoActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(Integer);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Null);
a=0;//     const-string v0, "NO"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :sswitch_0
a=0;//     #v2=(Byte);v4=(Integer);v5=(Reference,Ljava/lang/String;);v6=(Integer);
a=0;//     const-string v6, "MasterKeyControlModule"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_1
a=0;//     #v6=(Integer);
a=0;//     const-string v1, "BuildInControlModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v1=(Null);
a=0;//     const-string v1, "OEMControlModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_3
a=0;//     #v1=(Null);
a=0;//     const-string v1, "RootJarModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_4
a=0;//     #v1=(Null);
a=0;//     const-string v1, "RootControlModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_5
a=0;//     #v1=(Null);
a=0;//     const-string v1, "SystemProcessControlModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_6
a=0;//     #v1=(Null);
a=0;//     const-string v1, "ImeControlModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_7
a=0;//     #v1=(Null);
a=0;//     const-string v1, "ShellControlModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_8
a=0;//     #v1=(Null);
a=0;//     const-string v1, "SDKControlModule"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v1=(Byte);
a=0;//     const-string v0, "MK"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_1
a=0;//     const-string v0, "BI"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     const-string v0, "OEM"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_3
a=0;//     const-string v0, "RJar"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_4
a=0;//     const-string v0, "Ro"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_5
a=0;//     const-string v0, "SysP"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_6
a=0;//     const-string v0, "Im"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_7
a=0;//     const-string v0, "Sh"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :pswitch_8
a=0;//     const-string v0, "Sd"
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "com.wukongtv.wkhelper.remoteplugin2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p0}, Lcom/wukongtv/wkhelper/a/j;->b(Ljava/lang/String;Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const-string v0, "PLUGIN"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "NEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v7, v0, v1}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Byte);
a=0;//     const-string v0, "PLUGIN"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "NO"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v7, v0, v1}, Lcom/wukongtv/wkhelper/InfoActivity;->a(ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/io/File;);
a=0;//     const v0, 0x7f070041
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v6=(LongLo);v7=(LongHi);v8=(Reference,Ljava/io/File;);
a=0;//     const v0, 0x7f070040
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         -0x7e451f2a -> :sswitch_1
a=0;//         -0x79a7d7d1 -> :sswitch_8
a=0;//         -0x66cb0754 -> :sswitch_0
a=0;//         -0x16b7af17 -> :sswitch_5
a=0;//         0xac7d9f9 -> :sswitch_7
a=0;//         0xb4ffc08 -> :sswitch_6
a=0;//         0x1da7ae32 -> :sswitch_2
a=0;//         0x4cc09985 -> :sswitch_3
a=0;//         0x4d15ac47 -> :sswitch_4
a=0;//     .end sparse-switch
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//     .end packed-switch
a=0;// .end method
}}
