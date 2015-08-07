package com.wukongtv.wkhelper.controller.b; class g { void a() { int a;
a=0;// .class public Lcom/wukongtv/wkhelper/controller/b/g;
a=0;// .super Lcom/wukongtv/wkhelper/controller/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field b:Ljava/lang/Process;
a=0;// 
a=0;// .field c:Ljava/io/DataOutputStream;
a=0;// 
a=0;// .field d:Ljava/io/File;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/wukongtv/wkhelper/controller/a;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/wukongtv/wkhelper/controller/b/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/wukongtv/wkhelper/controller/b/g;Ljava/io/File;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/wukongtv/wkhelper/controller/b/g;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/io/File;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     iput-object p1, p0, Lcom/wukongtv/wkhelper/controller/b/g;->d:Ljava/io/File;
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runtime;);
a=0;//     const-string v1, "su"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/g;->b:Ljava/lang/Process;
a=0;// 
a=0;//     new-instance v0, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v1, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/b/g;->b:Ljava/lang/Process;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Process;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v1, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/b/g;->b:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/DataOutputStream;);
a=0;//     iput-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/g;->c:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "export CLASSPATH="
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/wukongtv/wkhelper/controller/b/g;->c:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/g;->c:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/g;->c:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     const-string v2, "exec app_process /system/bin com.android.commands.input.Input $*"
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/g;->c:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->write([B)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/g;->c:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "true"
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(III)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b/h;);
a=0;//     invoke-direct {v0, p0, p2}, Lcom/wukongtv/wkhelper/controller/b/h;-><init>(Lcom/wukongtv/wkhelper/controller/b/g;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/h;);
a=0;//     invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/g;->c:Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/DataOutputStream;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Landroid/content/Context;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Lcom/wukongtv/wkhelper/a/m;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     const-string v2, "/data/local/tmp/input.jar"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v2, "input.jar"
a=0;// 
a=0;//     invoke-static {p1, v2, v1}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/wukongtv/wkhelper/controller/b/g;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/File;);v2=(Boolean);
a=0;//     const-string v1, "input.jar"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "input.jar"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v2, v1}, Lcom/wukongtv/wkhelper/a/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/FileOutputStream;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "input.jar"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {p0, v0}, Lcom/wukongtv/wkhelper/controller/b/g;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Landroid/content/Context;)Lcom/wukongtv/wkhelper/controller/a;
a=0;//     .locals 0
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public final b()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/wukongtv/wkhelper/controller/b/g;->b:Ljava/lang/Process;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Process;);
a=0;//     const-string v2, "java.lang.ProcessManager$ProcessImpl"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v0, "pid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "kill "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/wukongtv/wkhelper/a/m;->a(Ljava/lang/String;ZZ)Lcom/wukongtv/wkhelper/a/n;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/wukongtv/wkhelper/controller/b/g;->b:Ljava/lang/Process;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Process;->destroy()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b(III)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b/i;);
a=0;//     invoke-direct {v0, p0, p2, p3}, Lcom/wukongtv/wkhelper/controller/b/i;-><init>(Lcom/wukongtv/wkhelper/controller/b/g;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/i;);
a=0;//     invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "RootJarModule"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final c(III)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lcom/wukongtv/wkhelper/controller/b/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/wukongtv/wkhelper/controller/b/j;);
a=0;//     invoke-direct {v0, p0, p3, p2}, Lcom/wukongtv/wkhelper/controller/b/j;-><init>(Lcom/wukongtv/wkhelper/controller/b/g;II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/wukongtv/wkhelper/controller/b/j;);
a=0;//     invoke-static {v0}, Landroid/os/AsyncTask;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final c(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
