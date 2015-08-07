package com.wukongtv.wkhelper.CleanCache; class f { void a() { int a;
a=0;// .class final Lcom/wukongtv/wkhelper/CleanCache/f;
a=0;// .super Lcom/wukongtv/wkhelper/o;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/o;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 18
a=0;// 
a=0;//     invoke-super/range {p0 .. p1}, Lcom/wukongtv/wkhelper/o;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/f;);
a=0;//     iget-object v2, v0, Lcom/wukongtv/wkhelper/CleanCache/f;->a:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     :sswitch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v3, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sparse-switch v3, :sswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :sswitch_1
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v3, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     const v3, 0x7f07002d
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);v4=(Uninit);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4, v5}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->a(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->b(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->c(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->a(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->b(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     const v3, 0x7f070028
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v5, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->d(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x3e8
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     cmp-long v3, v8, v10
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_2
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v7, " B"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     aput-object v3, v5, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->c(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/4 v3, 0x7
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const-wide/16 v4, 0x9c4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/CleanCache/f;);
a=0;//     invoke-virtual {v0, v3, v4, v5}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->d(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     const-wide/32 v6, 0x100000
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     div-long/2addr v4, v6
a=0;// 
a=0;//     long-to-int v3, v4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->e(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/h/a;->a()Lcom/wukongtv/wkhelper/h/a;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lcom/wukongtv/wkhelper/h/a;);
a=0;//     iget-boolean v5, v4, Lcom/wukongtv/wkhelper/h/a;->b:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/b/m;->a()Lcom/wukongtv/wkhelper/b/m;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lcom/wukongtv/wkhelper/b/m;);
a=0;//     const/16 v6, 0x836
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     iput v6, v5, Lcom/wukongtv/wkhelper/b/m;->c:I
a=0;// 
a=0;//     iput v3, v5, Lcom/wukongtv/wkhelper/b/m;->d:I
a=0;// 
a=0;//     iput v2, v5, Lcom/wukongtv/wkhelper/b/m;->e:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/wukongtv/wkhelper/h/a;->a(Lcom/wukongtv/wkhelper/b/m;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);v3=(Byte);v6=(Null);v7=(Uninit);v10=(LongLo);v11=(LongHi);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     long-to-double v10, v8
a=0;// 
a=0;//     #v10=(DoubleLo);v11=(DoubleHi);
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D
a=0;// 
a=0;//     move-result-wide v10
a=0;// 
a=0;//     const-wide v12, 0x408f400000000000L
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D
a=0;// 
a=0;//     move-result-wide v12
a=0;// 
a=0;//     #v12=(DoubleLo);v13=(DoubleHi);
a=0;//     div-double/2addr v10, v12
a=0;// 
a=0;//     double-to-int v3, v10
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "kMGTPE"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v11, v3, -0x1
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Char);
a=0;//     invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v10, "%.1f %sB"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     new-array v11, v11, [Ljava/lang/Object;
a=0;// 
a=0;//     #v11=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     long-to-double v8, v8
a=0;// 
a=0;//     #v8=(DoubleLo);v9=(DoubleHi);
a=0;//     const-wide v14, 0x408f400000000000L
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     int-to-double v0, v3
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     invoke-static/range {v14 .. v17}, Ljava/lang/Math;->pow(DD)D
a=0;// 
a=0;//     move-result-wide v14
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     div-double/2addr v8, v14
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Double;);
a=0;//     aput-object v3, v11, v12
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aput-object v7, v11, v3
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :sswitch_2
a=0;//     #v0=(Reference,Landroid/os/Message;);v1=(Uninit);v3=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->f(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->f(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :sswitch_3
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->g(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->g(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/ImageView;->clearAnimation()V
a=0;// 
a=0;//     :cond_3
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-wide/16 v4, 0xfa0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4, v5}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :sswitch_4
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);v3=(Integer);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->h(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->h(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->i(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->c(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->b(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->i(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->j(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->e(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v4}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->e(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->c(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const v3, 0x7f07002c
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V
a=0;// 
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-wide/16 v4, 0xbb8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4, v5}, Lcom/wukongtv/wkhelper/CleanCache/f;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(Reference,Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;);v4=(Reference,Ljava/lang/String;);v5=(Uninit);
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->k(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcom/wukongtv/wkhelper/CleanCache/a;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->a(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->l(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->m(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->i(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->a(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->c(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0x7f07002e
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setText(I)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->a(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->c(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setClickable(Z)V
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->l(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->m(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     :cond_6
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->k(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Lcom/wukongtv/wkhelper/CleanCache/a;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/CleanCache/a;->b()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :sswitch_5
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     invoke-virtual {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :sswitch_6
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v4, "filesize"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-string v6, "file"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/io/File;
a=0;// 
a=0;//     invoke-static {v2, v4, v5}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->a(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;J)J
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->e(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/List;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-static {v2}, Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;->e(Lcom/wukongtv/wkhelper/CleanCache/CleanCacheActivity;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x4 -> :sswitch_2
a=0;//         0x5 -> :sswitch_3
a=0;//         0x6 -> :sswitch_4
a=0;//         0x7 -> :sswitch_5
a=0;//         0x8 -> :sswitch_6
a=0;//         0x110 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
}}
