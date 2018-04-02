# coding:utf-8
import os
import shutil
import re
import time
import json
import codecs


def rename():
    for file in os.listdir('.'):
        if file[-2:] == 'py':
            continue
        str = file.split(".")
        new_name = str[0] + '.' + str[1] + '.' + str[4]
        os.rename(file, new_name)


def submit():
    for file in os.listdir('.'):
        if file[-2:] == 'py':
            continue
        os.system('leetcode submit ' + file)
        time.sleep(20)


def makedirForJava():
    for file in os.listdir('.'):
        if not re.match("^[0-9]", file):
            continue
        str = file.split(".")
        if len(str[0]) == 1:
            str[0] = "00" + str[0]
        if len(str[0]) == 2:
            str[0] = "0" + str[0]
        floder = str[0] + '.' + str[1]
        if not os.path.exists(floder):
            os.mkdir(floder)
        newfile = str[1] + str[2]
        newPath = floder + '/' + newfile
        shutil.move(file, newPath)


def makeResultsJson():
    oldList = os.listdir(".")
    oldList.sort()
    jsonDict = dict()
    for file in oldList:
        if not re.match("^[0-9]", file):
            continue
        id, title, language = file.split('.')
        newDict = {'id': id,
                   'level': 1,
                   'title': title,
                   'language': [language],
                   'generated': True
                   }
        jsonDict[id] = newDict
    lastUpdatedTime = time.strftime("%Y-%m-%d", time.localtime())
    total = 811
    solved = len(oldList)
    locked = 50
    extra = {'lastUpdatedTime': lastUpdatedTime,
             'total': total, 'solved': solved, 'locked': locked}
    jsonDict['lastUpdatedTime'] = lastUpdatedTime
    jsonDict['total'] = total
    jsonDict['solved'] = solved
    jsonDict['locked'] = locked
    with open("../result.json", "w") as fp:
        json.dump(jsonDict, fp, indent=2, separators=(',', ': '))


def makeDbJson():
    fileList = os.listdir(".")
    fileList.sort()
    for file in fileList:
        if not re.match("^[0-9]", file):
            continue
        str = file.split('.')
        if len(str[0]) == 1:
            str[0] = "00" + str[0]
        if len(str[0]) == 2:
            str[0] = "0" + str[0]
        jsonDict = dict()
        with open(file, "r", encoding="utf8") as fr:
            jsonDict[str[2]] = fr.read()
        path = '../leetcode-viewer/solutions/' + \
            str[0] + '.' + str[1] + '/db.json'
        with open(path, 'w') as fw:
            json.dump(jsonDict, fw, indent=2, separators=(',', ': '))


def getQuestion():
    fileList = os.listdir(".")
    fileList.sort()
    for file in fileList:
        if not re.match("^[0-9]", file):
            continue
        str = file.split('.')
        if len(str[0]) == 1:
            str[0] = "00" + str[0]
        if len(str[0]) == 2:
            str[0] = "0" + str[0]
        with open(file, "r", encoding="utf8") as fr:
            lineList = []
            for line in fr:
                if re.match("^\s\*\/", line):
                    break
                if line[3:].strip():
                    newLine = line[3:] + '<br>'
                    lineList.append(newLine)
        path = '../leetcode-viewer/solutions/' + \
            str[0] + '.' + str[1] + '/question.md'
        with open(path, 'w', encoding="utf8") as fw:
            fw.writelines(lineList)

if __name__ == "__main__":
    getQuestion()
