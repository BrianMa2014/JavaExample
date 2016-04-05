package note;

/**
 * Created by MaMingJiang on 2016/4/5.
 */
public class HowToResetCommit {
    /**情景: 已经提交了commit,想要reset这个commit
       1. git add .
       2. git commit -m "test"

     resolution:
       1. git log 查看所有的commit记录,copy 想要reset的commit的hash :commit_id
       2. git reset --hard commit_id
     */
}
