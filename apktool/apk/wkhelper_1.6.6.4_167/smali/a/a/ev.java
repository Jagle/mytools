package a.a; class ev { void a() { int a;
a=0;// .class public final La/a/ev;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:[B
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:[B
a=0;// 
a=0;// .field private e:[B
a=0;// 
a=0;// .field private f:[B
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:[B
a=0;// 
a=0;// .field private k:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>([BLjava/lang/String;[B)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/a/ev;);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, La/a/ev;->a:[B
a=0;// 
a=0;//     const-string v0, "1.0"
a=0;// 
a=0;//     iput-object v0, p0, La/a/ev;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, La/a/ev;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, La/a/ev;->d:[B
a=0;// 
a=0;//     iput-object v1, p0, La/a/ev;->e:[B
a=0;// 
a=0;//     iput-object v1, p0, La/a/ev;->f:[B
a=0;// 
a=0;//     iput v2, p0, La/a/ev;->g:I
a=0;// 
a=0;//     iput v2, p0, La/a/ev;->h:I
a=0;// 
a=0;//     iput v2, p0, La/a/ev;->i:I
a=0;// 
a=0;//     iput-object v1, p0, La/a/ev;->j:[B
a=0;// 
a=0;//     iput-object v1, p0, La/a/ev;->k:[B
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "entity is null or empty"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     iput-object p2, p0, La/a/ev;->c:Ljava/lang/String;
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     iput v0, p0, La/a/ev;->i:I
a=0;// 
a=0;//     invoke-static {p1}, La/a/eq;->a([B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, La/a/ev;->j:[B
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-long/2addr v0, v2
a=0;// 
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, La/a/ev;->h:I
a=0;// 
a=0;//     iput-object p3, p0, La/a/ev;->k:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;[B)La/a/ev;
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0}, La/a/eo;->k(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, La/a/eo;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "umeng_general_config"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v0, "signature"
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-interface {v4, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "serial"
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-interface {v4, v0, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-instance v0, La/a/ev;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/ev;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, p2, p1, v2}, La/a/ev;-><init>([BLjava/lang/String;[B)V
a=0;// 
a=0;//     #v0=(Reference,La/a/ev;);
a=0;//     invoke-direct {v0, v5}, La/a/ev;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     iput v6, v0, La/a/ev;->g:I
a=0;// 
a=0;//     iget-object v2, v0, La/a/ev;->d:[B
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, v0, La/a/ev;->a:[B
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x3e8
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     div-long/2addr v8, v10
a=0;// 
a=0;//     long-to-int v3, v8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v2, v3}, La/a/ev;->a([BI)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, La/a/ev;->d:[B
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v2, v0, La/a/ev;->d:[B
a=0;// 
a=0;//     iget v3, v0, La/a/ev;->h:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v2, v3}, La/a/ev;->a([BI)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, La/a/ev;->e:[B
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, v0, La/a/ev;->d:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-static {v3}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v3, v0, La/a/ev;->g:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v3, v0, La/a/ev;->h:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v3, v0, La/a/ev;->i:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-object v3, v0, La/a/ev;->e:[B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-static {v3}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, La/a/ev;->a([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, La/a/ev;->f:[B
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "serial"
a=0;// 
a=0;//     add-int/lit8 v4, v6, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "signature"
a=0;// 
a=0;//     invoke-direct {v0}, La/a/ev;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/lang/String;)[B
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rem-int/lit8 v1, v2, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     div-int/lit8 v0, v2, 0x2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     div-int/lit8 v3, v1, 0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v4, v1, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/16 v5, 0x10
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v0, v3
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a([B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "MD5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a([BI)[B
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, La/a/ev;->k:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-static {v1}, La/a/ev;->a([B)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget-object v1, p0, La/a/ev;->j:[B
a=0;// 
a=0;//     invoke-static {v1}, La/a/ev;->a([B)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int/lit8 v1, v4, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v5, v1, [B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v1, v4, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-lt v1, v8, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     and-int/lit16 v2, p2, 0xff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v1, v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     shr-int/lit8 v3, p2, 0x8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v1, v2
a=0;// 
a=0;//     shr-int/lit8 v2, p2, 0x10
a=0;// 
a=0;//     #v2=(Short);
a=0;//     and-int/lit16 v2, v2, 0xff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v1, v8
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     ushr-int/lit8 v3, p2, 0x18
a=0;// 
a=0;//     #v3=(Char);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v1, v2
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(Byte);
a=0;//     array-length v2, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_2
a=0;// 
a=0;//     return-object v5
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Integer);v2=(Reference,[B);v3=(Reference,[B);
a=0;//     mul-int/lit8 v6, v1, 0x2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget-byte v7, v3, v1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     aput-byte v7, v5, v6
a=0;// 
a=0;//     mul-int/lit8 v6, v1, 0x2
a=0;// 
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     aget-byte v7, v2, v1
a=0;// 
a=0;//     aput-byte v7, v5, v6
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     aget-byte v2, p1, v1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v5, v1
a=0;// 
a=0;//     array-length v2, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v2, v1
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v3, v1
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     aget-byte v3, p1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v5, v2
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Reference,[B);
a=0;//     aget-byte v2, v5, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     rem-int/lit8 v3, v0, 0x4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-byte v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     xor-int/2addr v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v5, v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, La/a/ev;->d:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v0}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static b([B)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v0, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Null);
a=0;//     const-string v3, "%02X"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     aget-byte v5, p0, v0
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Byte;);
a=0;//     aput-object v5, v4, v1
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, La/a/ev;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, La/a/ev;->d:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()[B
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v2, La/a/ei;
a=0;// 
a=0;//     #v2=(UninitRef,La/a/ei;);
a=0;//     invoke-direct {v2}, La/a/ei;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,La/a/ei;);
a=0;//     iget-object v0, p0, La/a/ev;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, v2, La/a/ei;->a:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, La/a/ev;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v2, La/a/ei;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, La/a/ev;->d:[B
a=0;// 
a=0;//     invoke-static {v0}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, La/a/ei;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, p0, La/a/ev;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, v2, La/a/ei;->d:I
a=0;// 
a=0;//     invoke-virtual {v2}, La/a/ei;->a()V
a=0;// 
a=0;//     iget v0, p0, La/a/ev;->h:I
a=0;// 
a=0;//     iput v0, v2, La/a/ei;->e:I
a=0;// 
a=0;//     invoke-virtual {v2}, La/a/ei;->b()V
a=0;// 
a=0;//     iget v0, p0, La/a/ev;->i:I
a=0;// 
a=0;//     iput v0, v2, La/a/ei;->f:I
a=0;// 
a=0;//     invoke-virtual {v2}, La/a/ei;->c()V
a=0;// 
a=0;//     iget-object v0, p0, La/a/ev;->j:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-object v0, v2, La/a/ei;->g:Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     iget-object v0, p0, La/a/ev;->e:[B
a=0;// 
a=0;//     invoke-static {v0}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, La/a/ei;->h:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, La/a/ev;->f:[B
a=0;// 
a=0;//     invoke-static {v0}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, La/a/ei;->i:Ljava/lang/String;
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, La/a/fb;
a=0;// 
a=0;//     #v0=(UninitRef,La/a/fb;);
a=0;//     invoke-direct {v0}, La/a/fb;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,La/a/fb;);
a=0;//     invoke-virtual {v0, v2}, La/a/fb;->a(La/a/eu;)[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,[B);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "version : %s\n"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     iget-object v3, p0, La/a/ev;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "address : %s\n"
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v3, p0, La/a/ev;->c:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "signature : %s\n"
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v3, p0, La/a/ev;->d:[B
a=0;// 
a=0;//     invoke-static {v3}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "serial : %s\n"
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     iget v3, p0, La/a/ev;->g:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "timestamp : %d\n"
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     iget v3, p0, La/a/ev;->h:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "length : %d\n"
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     iget v3, p0, La/a/ev;->i:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "guid : %s\n"
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v3, p0, La/a/ev;->e:[B
a=0;// 
a=0;//     invoke-static {v3}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "checksum : %s "
a=0;// 
a=0;//     new-array v2, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v3, p0, La/a/ev;->f:[B
a=0;// 
a=0;//     invoke-static {v3}, La/a/ev;->b([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
