package com.umeng.a; class p { void a() { int a;
a=0;// .class final Lcom/umeng/a/p;
a=0;// .super Lcom/umeng/a/s;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/umeng/a/o;
a=0;// 
a=0;// .field private final synthetic b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/umeng/a/o;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/umeng/a/p;->a:Lcom/umeng/a/o;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/umeng/a/p;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/umeng/a/s;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/a/p;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()V
a=0;//     .locals 20
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/a/p;);
a=0;//     iget-object v2, v0, Lcom/umeng/a/p;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "umeng_general_config"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v11, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/content/SharedPreferences;);
a=0;//     if-eqz v12, :cond_3
a=0;// 
a=0;//     const-string v2, "a_start_time"
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface {v12, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-string v4, "a_end_time"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-interface {v12, v4, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     cmp-long v8, v2, v8
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     sub-long v2, v6, v2
a=0;// 
a=0;//     sget-wide v8, Lcom/umeng/a/a;->n:J
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     cmp-long v2, v2, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "onResume called before onPause"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, La/a/ep;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     invoke-static {v11}, La/a/gq;->a(Landroid/content/Context;)La/a/gq;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,La/a/gq;);
a=0;//     invoke-static {v11}, La/a/eo;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v11}, Lcom/umeng/a/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v3, "Appkey is null or empty, Please check AndroidManifest.xml"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(LongHi);v13=(Uninit);
a=0;//     sub-long v2, v6, v4
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     sget-wide v4, Lcom/umeng/a/a;->n:J
a=0;// 
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v13=(Reference,La/a/gq;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, La/a/er;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "umeng_general_config"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v11, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v2, "session_id"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-interface {v15, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);v10=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     invoke-interface {v12}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "session_id"
a=0;// 
a=0;//     invoke-interface {v3, v4, v14}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v4, "session_start_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-interface {v3, v4, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v4, "session_end_time"
a=0;// 
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     invoke-interface {v3, v4, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     invoke-virtual {v13, v2}, La/a/gq;->a(La/a/gx;)V
a=0;// 
a=0;//     :goto_2
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Start new session: "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, La/a/ep;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_3
a=0;//     #v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-interface {v12}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "a_start_time"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "a_end_time"
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Null);v4=(Reference,Ljava/lang/String;);v5=(LongHi);v6=(Reference,Ljava/lang/StringBuilder;);v7=(LongHi);v9=(LongHi);v10=(Uninit);v13=(Reference,La/a/gq;);v14=(Reference,Ljava/lang/String;);v15=(Reference,Landroid/content/SharedPreferences;);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     const-string v2, "session_start_time"
a=0;// 
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-interface {v15, v2, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     const-string v2, "session_end_time"
a=0;// 
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     #v8=(LongLo);
a=0;//     invoke-interface {v15, v2, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v16, 0x0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     cmp-long v5, v8, v16
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     sub-long v2, v8, v6
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J
a=0;// 
a=0;//     move-result-wide v16
a=0;// 
a=0;//     const-wide/32 v18, 0x5265c00
a=0;// 
a=0;//     #v18=(LongLo);v19=(LongHi);
a=0;//     cmp-long v5, v16, v18
a=0;// 
a=0;//     if-lez v5, :cond_5
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     :cond_5
a=0;//     #v18=(Conflicted);v19=(Conflicted);
a=0;//     new-instance v10, La/a/e;
a=0;// 
a=0;//     #v10=(UninitRef,La/a/e;);
a=0;//     invoke-direct {v10}, La/a/e;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,La/a/e;);
a=0;//     iput-object v4, v10, La/a/dk;->a:Ljava/lang/String;
a=0;// 
a=0;//     iput-wide v6, v10, La/a/dk;->b:J
a=0;// 
a=0;//     invoke-virtual {v10}, La/a/dk;->a()V
a=0;// 
a=0;//     iput-wide v8, v10, La/a/dk;->c:J
a=0;// 
a=0;//     invoke-virtual {v10}, La/a/dk;->b()V
a=0;// 
a=0;//     iput-wide v2, v10, La/a/dk;->d:J
a=0;// 
a=0;//     invoke-virtual {v10}, La/a/dk;->c()V
a=0;// 
a=0;//     invoke-static {}, Lcom/umeng/a/a;->a()[D
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[D);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     new-instance v3, La/a/cc;
a=0;// 
a=0;//     #v3=(UninitRef,La/a/cc;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-wide v4, v2, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget-wide v6, v2, v6
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     invoke-direct/range {v3 .. v9}, La/a/cc;-><init>(DDJ)V
a=0;// 
a=0;//     #v3=(Reference,La/a/cc;);
a=0;//     invoke-virtual {v10}, La/a/e;->e()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     iget-object v2, v10, La/a/dk;->f:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, v10, La/a/dk;->f:Ljava/util/List;
a=0;// 
a=0;//     :cond_6
a=0;//     iget-object v2, v10, La/a/dk;->f:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-static {v11}, La/a/he;->a(Landroid/content/Context;)La/a/dq;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     iput-object v2, v10, La/a/dk;->g:La/a/dq;
a=0;// 
a=0;//     :cond_8
a=0;//     invoke-static {v15}, La/a/hf;->a(Landroid/content/SharedPreferences;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_9
a=0;// 
a=0;//     iput-object v2, v10, La/a/dk;->e:Ljava/util/List;
a=0;// 
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);
a=0;//     invoke-interface {v15}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "session_start_time"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "session_end_time"
a=0;// 
a=0;//     invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "session_id"
a=0;// 
a=0;//     invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "a_start_time"
a=0;// 
a=0;//     invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "a_end_time"
a=0;// 
a=0;//     invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v3, "activities"
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     move-object v2, v10
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v2=(Boolean);v4=(LongLo);v5=(LongHi);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [La/a/cc;
a=0;// 
a=0;//     #v2=(Reference,[La/a/cc;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v10, La/a/dk;->f:Ljava/util/List;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_b
a=0;//     #v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v8=(Conflicted);v10=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v13, v2}, La/a/gq;->a(La/a/gx;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_c
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(LongLo);v5=(LongHi);v10=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     const-string v2, "session_id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v12, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "MobclickAgent"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Extend current session: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v3, v2}, La/a/ep;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// .end method
}}
