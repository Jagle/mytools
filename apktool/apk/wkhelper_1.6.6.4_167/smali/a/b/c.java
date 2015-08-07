package a.b; class c { void a() { int a;
a=0;// .class public La/b/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String;
a=0;// 
a=0;// .field private static b:La/b/c;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Landroid/content/res/Resources;
a=0;// 
a=0;// .field private final d:Ljava/lang/String;
a=0;// 
a=0;// .field private final e:Ljava/lang/String;
a=0;// 
a=0;// .field private final f:Ljava/lang/String;
a=0;// 
a=0;// .field private final g:Ljava/lang/String;
a=0;// 
a=0;// .field private final h:Ljava/lang/String;
a=0;// 
a=0;// .field private final i:Ljava/lang/String;
a=0;// 
a=0;// .field private final j:Ljava/lang/String;
a=0;// 
a=0;// .field private final k:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, La/b/c;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, La/b/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, La/b/c;->b:La/b/c;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,La/b/c;);
a=0;//     const-string v0, "drawable"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, La/b/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "layout"
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "anim"
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "style"
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "string"
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "array"
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->c:Landroid/content/res/Resources;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, La/b/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)La/b/c;
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, La/b/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, La/b/c;->b:La/b/c;
a=0;// 
a=0;//     #v0=(Reference,La/b/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, La/b/c;
a=0;// 
a=0;//     #v0=(UninitRef,La/b/c;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, La/b/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,La/b/c;);
a=0;//     sput-object v0, La/b/c;->b:La/b/c;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, La/b/c;->b:La/b/c;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, v0}, La/b/c;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method final a(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, La/b/c;->c:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     iget-object v1, p0, La/b/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1, p2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, La/b/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "getRes("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "/ "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, La/b/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "Error getting resource. Make sure you have copied all resources (res/) from SDK to your project. "
a=0;// 
a=0;//     invoke-static {v0, v1}, La/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "drawable"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, v0}, La/b/c;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final c(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "layout"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, v0}, La/b/c;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final d(Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "string"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, p1, v0}, La/b/c;->a(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
